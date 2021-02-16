// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.6.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding EnumSimple set final model
type FinalModelSetEnumSimple struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int

    // Set item final model
    model *FinalModelEnumSimple
}

// Create a new EnumSimple set final model
func NewFinalModelSetEnumSimple(buffer *fbe.Buffer, offset int) *FinalModelSetEnumSimple {
    fbeResult := FinalModelSetEnumSimple{buffer: buffer, offset: offset}
    fbeResult.model = NewFinalModelEnumSimple(buffer, offset)
    return &fbeResult
}

// Get the allocation size
func (fm *FinalModelSetEnumSimple) FBEAllocationSize(values map[EnumSimpleKey]EnumSimple) int {
    size := 4
    for _, value := range values {
        size += fm.model.FBEAllocationSize(&value)
    }
    return size
}

// Get the final offset
func (fm *FinalModelSetEnumSimple) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelSetEnumSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelSetEnumSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelSetEnumSimple) FBEUnshift(size int) { fm.offset -= size }

// Check if the set value is valid
func (fm *FinalModelSetEnumSimple) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))

    size := 4
    fm.model.SetFBEOffset(fm.FBEOffset() + 4)
    for i := fbeSetSize; i > 0; i-- {
        offset := fm.model.Verify()
        if offset == fbe.MaxInt {
            return fbe.MaxInt
        }
        fm.model.FBEShift(offset)
        size += offset
    }
    return size
}

// Get the set value
func (fm *FinalModelSetEnumSimple) Get() (map[EnumSimpleKey]EnumSimple, int, error) {
    values := make(map[EnumSimpleKey]EnumSimple)

    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return values, 0, errors.New("model is broken")
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if fbeSetSize == 0 {
        return values, 4, nil
    }

    size := 4
    fm.model.SetFBEOffset(fm.FBEOffset() + 4)
    for i := 0; i < fbeSetSize; i++ {
        value, offset, err := fm.model.Get()
        if err != nil {
            return values, size, err
        }
        values[value.Key()] = *value
        fm.model.FBEShift(offset)
        size += offset
    }
    return values, size, nil
}

// Set the set value
func (fm *FinalModelSetEnumSimple) Set(values map[EnumSimpleKey]EnumSimple) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(len(values)))

    size := 4
    fm.model.SetFBEOffset(fm.FBEOffset() + 4)
    for _, value := range values {
        offset, err := fm.model.Set(&value)
        if err != nil {
            return size, err
        }
        fm.model.FBEShift(offset)
        size += offset
    }
    return size, nil
}
