// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0


import Foundation

public enum EnumInt32Enum {
    typealias RawValue = Int32
    case ENUM_VALUE_0
    case ENUM_VALUE_1
    case ENUM_VALUE_2
    case ENUM_VALUE_3
    case ENUM_VALUE_4
    case ENUM_VALUE_5

    var rawValue: RawValue {
        switch self {
        case .ENUM_VALUE_0: return 0 + 0
        case .ENUM_VALUE_1: return -2147483648 + 0
        case .ENUM_VALUE_2: return -2147483648 + 1
        case .ENUM_VALUE_3: return 2147483646 + 0
        case .ENUM_VALUE_4: return 2147483646 + 1
        case .ENUM_VALUE_5: return Self.ENUM_VALUE_3.rawValue
        }
    }

    init(value: Int8) { self = EnumInt32Enum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int16) { self = EnumInt32Enum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int32) { self = EnumInt32Enum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int64) { self = EnumInt32Enum(rawValue: NSNumber(value: value).int32Value) }
    init(value: EnumInt32Enum) { self = EnumInt32Enum(rawValue: value.rawValue) }
    init(rawValue: Int32) { self = Self.mapValue(value: rawValue)! }

    var description: String {
        switch self {
        case .ENUM_VALUE_0: return "ENUM_VALUE_0"
        case .ENUM_VALUE_1: return "ENUM_VALUE_1"
        case .ENUM_VALUE_2: return "ENUM_VALUE_2"
        case .ENUM_VALUE_3: return "ENUM_VALUE_3"
        case .ENUM_VALUE_4: return "ENUM_VALUE_4"
        case .ENUM_VALUE_5: return "ENUM_VALUE_5"
        }
    }

    static func values() -> [EnumInt32Enum] {
        return [
            EnumInt32Enum.ENUM_VALUE_0,
            EnumInt32Enum.ENUM_VALUE_1,
            EnumInt32Enum.ENUM_VALUE_2,
            EnumInt32Enum.ENUM_VALUE_3,
            EnumInt32Enum.ENUM_VALUE_4,
            EnumInt32Enum.ENUM_VALUE_5,
        ]
    }

    static func mapValue(value: Int32) -> EnumInt32Enum? {
        var mapping = Dictionary<Int32, EnumInt32Enum>()
        for value in values() {
            mapping[value.rawValue] = value
        }
        return mapping[value]
    }
}
