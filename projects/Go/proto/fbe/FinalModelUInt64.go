// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.6.0.0

package fbe

import "errors"

// Fast Binary Encoding UInt64 final model
type FinalModelUInt64 struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new UInt64 final model
func NewFinalModelUInt64(buffer *Buffer, offset int) *FinalModelUInt64 {
    return &FinalModelUInt64{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelUInt64) FBEAllocationSize(value uint64) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelUInt64) FBESize() int { return 8 }

// Get the final offset
func (fm *FinalModelUInt64) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelUInt64) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelUInt64) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelUInt64) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelUInt64) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelUInt64) Get() (uint64, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, 0, errors.New("model is broken")
    }

    return ReadUInt64(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), fm.FBESize(), nil
}

// Set the value
func (fm *FinalModelUInt64) Set(value uint64) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    WriteUInt64(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return fm.FBESize(), nil
}
