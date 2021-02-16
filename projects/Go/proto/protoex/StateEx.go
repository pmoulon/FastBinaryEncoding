// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.6.0.0

package protoex

import "strings"
import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// StateEx flags key
type StateExKey byte

// Convert StateEx flags key to string
func (k StateExKey) String() string {
    return StateEx(k).String()
}

// StateEx flags
type StateEx byte

// StateEx flags values
//noinspection GoSnakeCaseUsage
const (
    StateEx_unknown = StateEx(0x00)
    StateEx_invalid = StateEx(0x01)
    StateEx_initialized = StateEx(0x02)
    StateEx_calculated = StateEx(0x04)
    StateEx_broken = StateEx(0x08)
    StateEx_happy = StateEx(0x10)
    StateEx_sad = StateEx(0x20)
    StateEx_good = StateEx(StateEx_initialized | StateEx_calculated)
    StateEx_bad = StateEx(StateEx_unknown | StateEx_invalid | StateEx_broken)
)

// Create a new StateEx flags
func NewStateEx() *StateEx {
    return new(StateEx)
}

// Create a new StateEx flags from the given flags
func NewStateExFromValue(flags byte) *StateEx {
    result := StateEx(flags)
    return &result
}

// Is flags set?
func (f StateEx) HasFlags(flags StateEx) bool {
    return ((f & flags) != 0) && ((f & flags) == flags)
}

// Set flags
func (f *StateEx) SetFlags(flags StateEx) *StateEx {
    *f |= flags
    return f
}

// Remove flags
func (f *StateEx) RemoveFlags(flags StateEx) *StateEx {
    *f &^= flags
    return f
}

// Get the flags key
func (f StateEx) Key() StateExKey {
    return StateExKey(f)
}

// Convert flags to optional
func (f *StateEx) Optional() *StateEx {
    return f
}

// Convert flags to string
//noinspection GoBoolExpressions
func (f StateEx) String() string {
    var sb strings.Builder
    first := true
    if ((f & StateEx_unknown) != 0) && ((f & StateEx_unknown) == StateEx_unknown) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("unknown")
    }
    if ((f & StateEx_invalid) != 0) && ((f & StateEx_invalid) == StateEx_invalid) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("invalid")
    }
    if ((f & StateEx_initialized) != 0) && ((f & StateEx_initialized) == StateEx_initialized) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("initialized")
    }
    if ((f & StateEx_calculated) != 0) && ((f & StateEx_calculated) == StateEx_calculated) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("calculated")
    }
    if ((f & StateEx_broken) != 0) && ((f & StateEx_broken) == StateEx_broken) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("broken")
    }
    if ((f & StateEx_happy) != 0) && ((f & StateEx_happy) == StateEx_happy) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("happy")
    }
    if ((f & StateEx_sad) != 0) && ((f & StateEx_sad) == StateEx_sad) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("sad")
    }
    if ((f & StateEx_good) != 0) && ((f & StateEx_good) == StateEx_good) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("good")
    }
    if ((f & StateEx_bad) != 0) && ((f & StateEx_bad) == StateEx_bad) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("bad")
    }
    return sb.String()
}

// Convert flags to JSON
func (f StateEx) MarshalJSON() ([]byte, error) {
    value := byte(f)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to flags
func (f *StateEx) UnmarshalJSON(buffer []byte) error {
    var result byte
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *f = StateEx(result)
    return nil
}
