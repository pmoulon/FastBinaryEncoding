// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.3.0.0

package fbe

import "errors"

// Fast Binary Encoding UUID field model
type FieldModelUUID struct {
    // Field model buffer
    buffer *Buffer
    // Field model buffer offset
    offset int
}

// Create a new UUID field model
func NewFieldModelUUID(buffer *Buffer, offset int) *FieldModelUUID {
    return &FieldModelUUID{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelUUID) FBESize() int { return 16 }
// Get the field extra size
func (fm *FieldModelUUID) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelUUID) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelUUID) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelUUID) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelUUID) FBEUnshift(size int) { fm.offset -= size }

// Check if the UUID value is valid
func (fm *FieldModelUUID) Verify() bool { return true }

// Get the UUID value
func (fm *FieldModelUUID) Get() (UUID, error) {
    return fm.GetDefault(UUIDNil())
}

// Get the UUID value with provided default value
func (fm *FieldModelUUID) GetDefault(defaults UUID) (UUID, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    return ReadUUID(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), nil
}

// Set the UUID value
func (fm *FieldModelUUID) Set(value UUID) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    WriteUUID(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return nil
}
