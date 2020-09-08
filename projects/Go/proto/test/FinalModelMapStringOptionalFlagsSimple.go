// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.3.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding String->OptionalFlagsSimple map final model
type FinalModelMapStringOptionalFlagsSimple struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int

    // Map key final model
    modelKey *fbe.FinalModelString
    // Map value final model
    modelValue *FinalModelOptionalFlagsSimple
}

// Create a new String->OptionalFlagsSimple map final model
func NewFinalModelMapStringOptionalFlagsSimple(buffer *fbe.Buffer, offset int) *FinalModelMapStringOptionalFlagsSimple {
    fbeResult := FinalModelMapStringOptionalFlagsSimple{buffer: buffer, offset: offset}
    fbeResult.modelKey = fbe.NewFinalModelString(buffer, offset)
    fbeResult.modelValue = NewFinalModelOptionalFlagsSimple(buffer, offset)
    return &fbeResult
}

// Get the allocation size
func (fm *FinalModelMapStringOptionalFlagsSimple) FBEAllocationSize(values map[string]*FlagsSimple) int {
    size := 4
    for key, value := range values {
        size += fm.modelKey.FBEAllocationSize(key)
        size += fm.modelValue.FBEAllocationSize(value)
    }
    return size
}

// Get the final offset
func (fm *FinalModelMapStringOptionalFlagsSimple) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelMapStringOptionalFlagsSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelMapStringOptionalFlagsSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelMapStringOptionalFlagsSimple) FBEUnshift(size int) { fm.offset -= size }

// Check if the map is valid
func (fm *FinalModelMapStringOptionalFlagsSimple) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))

    size := 4
    fm.modelKey.SetFBEOffset(fm.FBEOffset() + 4)
    fm.modelValue.SetFBEOffset(fm.FBEOffset() + 4)
    for i := fbeSetSize; i > 0; i-- {
        offsetKey := fm.modelKey.Verify()
        if offsetKey == fbe.MaxInt {
            return fbe.MaxInt
        }
        fm.modelKey.FBEShift(offsetKey)
        fm.modelValue.FBEShift(offsetKey)
        size += offsetKey
        offsetValue := fm.modelValue.Verify()
        if offsetValue == fbe.MaxInt {
            return fbe.MaxInt
        }
        fm.modelKey.FBEShift(offsetValue)
        fm.modelValue.FBEShift(offsetValue)
        size += offsetValue
    }
    return size
}

// Get the map
func (fm *FinalModelMapStringOptionalFlagsSimple) Get() (map[string]*FlagsSimple, int, error) {
    values := make(map[string]*FlagsSimple)

    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return values, 0, errors.New("model is broken")
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if fbeSetSize == 0 {
        return values, 4, nil
    }

    size := 4
    fm.modelKey.SetFBEOffset(fm.FBEOffset() + 4)
    fm.modelValue.SetFBEOffset(fm.FBEOffset() + 4)
    for i := 0; i < fbeSetSize; i++ {
        key, offset, err := fm.modelKey.Get()
        if err != nil {
            return values, size, err
        }
        fm.modelKey.FBEShift(offset)
        fm.modelValue.FBEShift(offset)
        size += offset
        value, offset, err := fm.modelValue.Get()
        if err != nil {
            return values, size, err
        }
        fm.modelKey.FBEShift(offset)
        fm.modelValue.FBEShift(offset)
        size += offset
        values[key] = value
    }
    return values, size, nil
}

// Set the map
func (fm *FinalModelMapStringOptionalFlagsSimple) Set(values map[string]*FlagsSimple) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + 4) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(len(values)))

    size := 4
    fm.modelKey.SetFBEOffset(fm.FBEOffset() + 4)
    fm.modelValue.SetFBEOffset(fm.FBEOffset() + 4)
    for key, value := range values {
        offsetKey, err := fm.modelKey.Set(key)
        if err != nil {
            return size, err
        }
        fm.modelKey.FBEShift(offsetKey)
        fm.modelValue.FBEShift(offsetKey)
        offsetValue, err := fm.modelValue.Set(value)
        if err != nil {
            return size, err
        }
        fm.modelKey.FBEShift(offsetValue)
        fm.modelValue.FBEShift(offsetValue)
        size += offsetKey + offsetValue
    }
    return size, nil
}
