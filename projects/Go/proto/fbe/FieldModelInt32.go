// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.1.0.0

package fbe

import "time"
import "github.com/google/uuid"

// Workaround for Go unused imports issue
var _ = time.Unix(0, 0)
var _ = uuid.Nil

// Fast Binary Encoding int32 field model class
type FieldModelInt32 struct {
    buffer *Buffer  // Field model buffer
    offset int      // Field model buffer offset
}

// Get the field size
func (fm FieldModelInt32) FBESize() int { return 4 }
// Get the field extra size
func (fm FieldModelInt32) FBEExtra() int { return 0 }

// Get the field offset
func (fm FieldModelInt32) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelInt32) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelInt32) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelInt32) FBEUnshift(size int) { fm.offset -= size }

// Create a new field model
func NewFieldModelInt32(buffer *Buffer, offset int) *FieldModelInt32 {
    return &FieldModelInt32{buffer: buffer, offset: offset}
}

// Check if the value is valid
func (fm FieldModelInt32) Verify() bool { return true }

// Get the value
func (fm FieldModelInt32) Get() int32 {
    return fm.GetDefault(0)
}

// Get the value with provided default value
func (fm FieldModelInt32) GetDefault(defaults int32) int32 {
    if fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize() > fm.buffer.Size() {
        return defaults
    }

    return ReadInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset())
}

// Set the value
func (fm *FieldModelInt32) Set(value int32) {
    if fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize() > fm.buffer.Size() {
        return
    }

    WriteInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
}