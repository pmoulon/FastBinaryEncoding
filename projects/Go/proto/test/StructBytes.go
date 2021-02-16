// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

package test

import "fmt"
import "strconv"
import "strings"
import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Workaround for Go unused imports issue
var _ = fmt.Print
var _ = strconv.FormatInt

// StructBytes key
type StructBytesKey struct {
}

// Convert StructBytes flags key to string
func (k *StructBytesKey) String() string {
    var sb strings.Builder
    sb.WriteString("StructBytesKey(")
    sb.WriteString(")")
    return sb.String()
}

// StructBytes struct
type StructBytes struct {
    F1 []byte `json:"f1"`
    F2 *[]byte `json:"f2"`
    F3 *[]byte `json:"f3"`
}

// Create a new StructBytes struct
func NewStructBytes() *StructBytes {
    return &StructBytes{
        F1: make([]byte, 0),
        F2: nil,
        F3: nil,
    }
}

// Create a new StructBytes struct from the given field values
func NewStructBytesFromFieldValues(F1 []byte, F2 *[]byte, F3 *[]byte) *StructBytes {
    return &StructBytes{F1, F2, F3}
}

// Create a new StructBytes struct from JSON
func NewStructBytesFromJSON(buffer []byte) (*StructBytes, error) {
    result := *NewStructBytes()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s *StructBytes) Copy() *StructBytes {
    var result = *s
    return &result
}

// Struct deep clone
func (s *StructBytes) Clone() *StructBytes {
    // Serialize the struct to the FBE stream
    writer := NewStructBytesModel(fbe.NewEmptyBuffer())
    _, _ = writer.Serialize(s)

    // Deserialize the struct from the FBE stream
    reader := NewStructBytesModel(writer.Buffer())
    result, _, _ := reader.Deserialize()
    return result
}

// Get the struct key
func (s *StructBytes) Key() StructBytesKey {
    return StructBytesKey{
    }
}

// Convert struct to optional
func (s *StructBytes) Optional() *StructBytes {
    return s
}

// Get the FBE type
func (s *StructBytes) FBEType() int { return 120 }

// Convert struct to string
func (s *StructBytes) String() string {
    var sb strings.Builder
    sb.WriteString("StructBytes(")
    sb.WriteString("f1=")
    if s.F1 != nil { 
        sb.WriteString("bytes[" + strconv.FormatInt(int64(len(s.F1)), 10) + "]")
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(",f2=")
    if s.F2 != nil { 
        sb.WriteString("bytes[" + strconv.FormatInt(int64(len(*s.F2)), 10) + "]")
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(",f3=")
    if s.F3 != nil { 
        sb.WriteString("bytes[" + strconv.FormatInt(int64(len(*s.F3)), 10) + "]")
    } else {
        sb.WriteString("null")
    }
    sb.WriteString(")")
    return sb.String()
}

// Convert struct to JSON
func (s *StructBytes) JSON() ([]byte, error) {
    return fbe.Json.Marshal(s)
}
