// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.6.0.0

package protoex

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding BalanceMessage final model
type BalanceMessageFinalModel struct {
    // Model buffer
    buffer *fbe.Buffer

    // Final model
    model *FinalModelBalanceMessage
}

// Create a new BalanceMessage final model
func NewBalanceMessageFinalModel(buffer *fbe.Buffer) *BalanceMessageFinalModel {
    return &BalanceMessageFinalModel{buffer: buffer, model: NewFinalModelBalanceMessage(buffer, 8)}
}

// Get the final model buffer
func (m *BalanceMessageFinalModel) Buffer() *fbe.Buffer { return m.buffer }
// Get the final model
func (m *BalanceMessageFinalModel) Model() *FinalModelBalanceMessage { return m.model }

// // Get the final model type
func (m *BalanceMessageFinalModel) FBEType() int { return m.model.FBEType() }

// Check if the struct value is valid
func (m *BalanceMessageFinalModel) Verify() bool {
    if (m.buffer.Offset() + m.model.FBEOffset() - 4) > m.buffer.Size() {
        return false
    }

    fbeStructSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 8))
    fbeStructType := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if (fbeStructSize <= 0) || (fbeStructType != m.FBEType()) {
        return false
    }

    return (8 + m.model.Verify()) == fbeStructSize
}

// Create a new final model (begin phase)
func (m *BalanceMessageFinalModel) CreateBegin() int {
    fbeBegin := m.buffer.Allocate(4 + m.model.FBESize())
    return fbeBegin
}

// Create a new final model (end phase)
func (m *BalanceMessageFinalModel) CreateEnd(fbeBegin int) int {
    fbeEnd := m.buffer.Size()
    fbeFullSize := fbeEnd - fbeBegin
    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4, uint32(fbeFullSize))
    return fbeFullSize
}

// Serialize the struct value
func (m *BalanceMessageFinalModel) Serialize(value *BalanceMessage) (int, error) {
    fbeInitialSize := m.buffer.Size()

    fbeStructType := m.FBEType()
    fbeStructSize := 8 + m.model.FBEAllocationSize(value)
    fbeStructOffset := m.buffer.Allocate(fbeStructSize) - m.buffer.Offset()
    if (m.buffer.Offset() + fbeStructOffset + fbeStructSize) > m.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbeStructSize, err := m.model.Set(value)
    fbeStructSize += 8
    m.buffer.Resize(fbeInitialSize + fbeStructSize)

    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 8, uint32(fbeStructSize))
    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4, uint32(fbeStructType))

    return fbeStructSize, err
}

// Deserialize the struct value
func (m *BalanceMessageFinalModel) Deserialize() (*BalanceMessage, int, error) {
    value := NewBalanceMessage()
    fbeFullSize, err := m.DeserializeValue(value)
    return value, fbeFullSize, err
}

// Deserialize the struct value by the given pointer
func (m *BalanceMessageFinalModel) DeserializeValue(value *BalanceMessage) (int, error) {
    if (m.buffer.Offset() + m.model.FBEOffset()) > m.buffer.Size() {
        value = NewBalanceMessage()
        return 0, errors.New("model is broken")
    }

    fbeStructSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 8))
    fbeStructType := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if (fbeStructSize <= 0) || (fbeStructType != m.FBEType()) {
        value = NewBalanceMessage()
        return 8, errors.New("model is broken")
    }

    fbeStructSize, err := m.model.GetValue(value)
    return 8 + fbeStructSize, err
}

// Move to the next struct value
func (m *BalanceMessageFinalModel) Next(prev int) {
    m.model.FBEShift(prev)
}
