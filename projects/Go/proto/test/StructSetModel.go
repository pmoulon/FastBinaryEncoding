// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding StructSet model
type StructSetModel struct {
    // Model buffer
    buffer *fbe.Buffer

    // Field model
    model *FieldModelStructSet
}

// Create a new StructSet model
func NewStructSetModel(buffer *fbe.Buffer) *StructSetModel {
    return &StructSetModel{buffer: buffer, model: NewFieldModelStructSet(buffer, 4)}
}

// Get the model buffer
func (m *StructSetModel) Buffer() *fbe.Buffer { return m.buffer }
// Get the field model
func (m *StructSetModel) Model() *FieldModelStructSet { return m.model }

// Get the model size
func (m *StructSetModel) FBESize() int { return m.model.FBESize() + m.model.FBEExtra() }
// // Get the model type
func (m *StructSetModel) FBEType() int { return m.model.FBEType() }

// Check if the struct value is valid
func (m *StructSetModel) Verify() bool {
    if (m.buffer.Offset() + m.model.FBEOffset() - 4) > m.buffer.Size() {
        return false
    }

    fbeFullSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if fbeFullSize < m.model.FBESize() {
        return false
    }

    return m.model.Verify()
}

// Create a new model (begin phase)
func (m *StructSetModel) CreateBegin() int {
    fbeBegin := m.buffer.Allocate(4 + m.model.FBESize())
    return fbeBegin
}

// Create a new model (end phase)
func (m *StructSetModel) CreateEnd(fbeBegin int) int {
    fbeEnd := m.buffer.Size()
    fbeFullSize := fbeEnd - fbeBegin
    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4, uint32(fbeFullSize))
    return fbeFullSize
}

// Serialize the struct value
func (m *StructSetModel) Serialize(value *StructSet) (int, error) {
    fbeBegin := m.CreateBegin()
    err := m.model.Set(value)
    fbeFullSize := m.CreateEnd(fbeBegin)
    return fbeFullSize, err
}

// Deserialize the struct value
func (m *StructSetModel) Deserialize() (*StructSet, int, error) {
    value := NewStructSet()
    fbeFullSize, err := m.DeserializeValue(value)
    return value, fbeFullSize, err
}

// Deserialize the struct value by the given pointer
func (m *StructSetModel) DeserializeValue(value *StructSet) (int, error) {
    if (m.buffer.Offset() + m.model.FBEOffset() - 4) > m.buffer.Size() {
        value = NewStructSet()
        return 0, nil
    }

    fbeFullSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if fbeFullSize < m.model.FBESize() {
        value = NewStructSet()
        return 0, errors.New("model is broken")
    }

    err := m.model.GetValue(value)
    return fbeFullSize, err
}

// Move to the next struct value
func (m *StructSetModel) Next(prev int) {
    m.model.FBEShift(prev)
}
