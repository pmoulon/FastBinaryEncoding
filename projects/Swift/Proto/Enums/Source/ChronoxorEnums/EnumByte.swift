// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.6.0.0

import Foundation

public struct EnumByte: Comparable, Hashable, Codable {
    typealias RawValue = UInt8
    public static let ENUM_VALUE_0 = EnumByte(value: EnumByteEnum.ENUM_VALUE_0)
    public static let ENUM_VALUE_1 = EnumByte(value: EnumByteEnum.ENUM_VALUE_1)
    public static let ENUM_VALUE_2 = EnumByte(value: EnumByteEnum.ENUM_VALUE_2)
    public static let ENUM_VALUE_3 = EnumByte(value: EnumByteEnum.ENUM_VALUE_3)
    public static let ENUM_VALUE_4 = EnumByte(value: EnumByteEnum.ENUM_VALUE_4)
    public static let ENUM_VALUE_5 = EnumByte(value: EnumByteEnum.ENUM_VALUE_5)

    var value: EnumByteEnum?

    public var raw: UInt8 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: UInt8) { setEnum(value: value) }
    public init(value: EnumByteEnum) { setEnum(value: value) }
    public init(value: EnumByte) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).uint8Value) }

    public mutating func setEnum(value: UInt8) { self.value = EnumByteEnum.mapValue(value: value) }
    public mutating func setEnum(value: EnumByteEnum) { self.value = value }
    public mutating func setEnum(value: EnumByte) { self.value = value.value }

    public static func < (lhs: EnumByte, rhs: EnumByte) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: EnumByte, rhs: EnumByte) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue == rhsValue.rawValue
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(value?.rawValue ?? 0)
    }

    public var description: String {
        return value?.description ?? "<unknown>"
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> EnumByte {
        return try JSONDecoder().decode(EnumByte.self, from: json.data(using: .utf8)!)
    }
}
