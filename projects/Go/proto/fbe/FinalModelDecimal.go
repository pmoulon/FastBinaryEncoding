// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.3.0.0

package fbe

import "errors"
import "math/big"
import "github.com/shopspring/decimal"

// Fast Binary Encoding decimal final model
type FinalModelDecimal struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new decimal final model
func NewFinalModelDecimal(buffer *Buffer, offset int) *FinalModelDecimal {
    return &FinalModelDecimal{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelDecimal) FBEAllocationSize(value Decimal) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelDecimal) FBESize() int { return 16 }

// Get the final offset
func (fm *FinalModelDecimal) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelDecimal) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelDecimal) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelDecimal) FBEUnshift(size int) { fm.offset -= size }

// Check if the decimal value is valid
func (fm *FinalModelDecimal) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return MaxInt
    }

    return fm.FBESize()
}

// Get the decimal value
func (fm *FinalModelDecimal) Get() (Decimal, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return DecimalZero(), 0, errors.New("model is broken")
    }

    // Read decimal parts
    low := ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset())
    mid := ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 4)
    high := ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 8)
    flags := ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 12)

    // Calculate decimal value
    negative := (flags & 0x80000000) != 0
    scale := (flags & 0x7FFFFFFF) >> 16
    result := decimal.New(int64(high), 0).Mul(lowScaleFinal)
    result = result.Add(decimal.New(int64(mid), 0).Mul(midScaleFinal))
    result = result.Add(decimal.New(int64(low), 0))
    result = result.Shift(-int32(scale))
    if negative {
        result = result.Neg()
    }

    return Decimal{result}, fm.FBESize(), nil
}

// Set the decimal value
func (fm *FinalModelDecimal) Set(value Decimal) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    // Extract decimal parts
    negative := value.IsNegative()
    number := value.Coefficient()
    scale := -value.Exponent()

    // Check for decimal number overflow
    bits := number.BitLen()
    if (bits < 0) || (bits > 96) {
        // Value too big for .NET Decimal (bit length is limited to [0, 96])
        WriteCount(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), 0, fm.FBESize())
        return fm.FBESize(), errors.New("value too big for .NET Decimal (bit length is limited to [0, 96])")
    }

    // Check for decimal scale overflow
    if (scale < 0) || (scale > 28) {
        // Value scale exceeds .NET Decimal limit of [0, 28]
        WriteCount(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), 0, fm.FBESize())
        return fm.FBESize(), errors.New("value scale exceeds .NET Decimal limit of [0, 28]")
    }

    // Write unscaled value to bytes 0-11
    bytes := number.Bytes()
    for i := range bytes {
        WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + i, bytes[len(bytes) - i - 1])
    }
    WriteCount(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + len(bytes), 0, 12 - len(bytes))

    // Write scale at byte 14
    WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 14, byte(scale))

    // Write signum at byte 15
    if negative {
        WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 15, 0x80)
    } else {
        WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 15, 0)
    }
    return fm.FBESize(), nil
}

var lowScaleFinal, midScaleFinal decimal.Decimal

func init()  {
    var low, mid big.Int
    low.SetString("18446744073709551616", 10)
    mid.SetString("4294967296", 10)
    lowScaleFinal = decimal.NewFromBigInt(&low, 0)
    midScaleFinal = decimal.NewFromBigInt(&mid, 0)
}
