// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.6.0.0

package fbe

import "errors"

// Fast Binary Encoding Char field model
type FieldModelChar struct {
    // Field model buffer
    buffer *Buffer
    // Field model buffer offset
    offset int
}

// Create a new Char field model
func NewFieldModelChar(buffer *Buffer, offset int) *FieldModelChar {
    return &FieldModelChar{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelChar) FBESize() int { return 1 }
// Get the field extra size
func (fm *FieldModelChar) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelChar) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelChar) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelChar) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelChar) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelChar) Verify() bool { return true }

// Get the value
func (fm *FieldModelChar) Get() (rune, error) {
    return fm.GetDefault('\000')
}

// Get the value with provided default value
func (fm *FieldModelChar) GetDefault(defaults rune) (rune, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    return ReadChar(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), nil
}

// Set the value
func (fm *FieldModelChar) Set(value rune) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    WriteChar(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return nil
}
