// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.6.0.0

import Foundation

public struct StateEx: Comparable, Hashable, Codable {
    typealias RawValue = UInt8
    public static let unknown = StateEx(value: .unknown)
    public static let invalid = StateEx(value: .invalid)
    public static let initialized = StateEx(value: .initialized)
    public static let calculated = StateEx(value: .calculated)
    public static let broken = StateEx(value: .broken)
    public static let happy = StateEx(value: .happy)
    public static let sad = StateEx(value: .sad)
    public static let good = StateEx(value: .good)
    public static let bad = StateEx(value: .bad)

    public static func fromSet(set: StateExEnum) -> StateEx {
        var result = NSNumber(value: 0).intValue
        if set.contains(StateEx.unknown.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.unknown.raw).intValue
        }
        if set.contains(StateEx.invalid.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.invalid.raw).intValue
        }
        if set.contains(StateEx.initialized.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.initialized.raw).intValue
        }
        if set.contains(StateEx.calculated.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.calculated.raw).intValue
        }
        if set.contains(StateEx.broken.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.broken.raw).intValue
        }
        if set.contains(StateEx.happy.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.happy.raw).intValue
        }
        if set.contains(StateEx.sad.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.sad.raw).intValue
        }
        if set.contains(StateEx.good.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.good.raw).intValue
        }
        if set.contains(StateEx.bad.value!) {
            result = NSNumber(value: result).intValue | NSNumber(value: StateEx.bad.raw).intValue
        }
        return StateEx(value: NSNumber(value: result).uint8Value)
    }

    public private(set) var value: StateExEnum?

    public private(set) var raw: UInt8 = 0

    public init() { setDefaults() }
    public init(value: UInt8) { setEnum(value: value) }
    public init(value: StateExEnum) { setEnum(value: value) }
    public init(value: StateEx) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }

    public mutating func setDefaults() { setEnum(value: 0) }

    public mutating func setEnum(value: UInt8) { self.raw = value; self.value = StateExEnum.mapValue(value: value) }
    public mutating func setEnum(value: StateExEnum) { self.raw = value.rawValue; self.value = value }
    public mutating func setEnum(value: StateEx) { self.raw = value.raw; self.value = value.value }

    public func hasFlags(flags: UInt8) -> Bool { return (NSNumber(value: raw).intValue & NSNumber(value: flags).intValue != 0) && ((NSNumber(value: raw).intValue & NSNumber(value: flags).intValue) == NSNumber(value: flags).intValue) }
    public func hasFlags(flags: StateExEnum) -> Bool { return hasFlags(flags: flags.rawValue) }
    public func hasFlags(flags: StateEx) -> Bool { return hasFlags(flags: flags.raw) }

    public mutating func setFlags(flags: UInt8) -> StateEx { setEnum(value: NSNumber(value: NSNumber(value: raw).intValue | NSNumber(value: flags).intValue).uint8Value); return self }
    public mutating func setFlags(flags: StateExEnum) -> StateEx { _ = setFlags(flags: flags.rawValue); return self }
    public mutating func setFlags(flags: StateEx) -> StateEx { _ = setFlags(flags: flags.raw); return self }

    public mutating func removeFlags(flags: UInt8) -> StateEx { setEnum(value: NSNumber(value: NSNumber(value: raw).intValue | NSNumber(value: flags).intValue.byteSwapped).uint8Value); return self }
    public mutating func removeFlags(flags: StateExEnum) -> StateEx { _ = removeFlags(flags: flags.rawValue); return self }
    public mutating func removeFlags(flags: StateEx) -> StateEx { _ = removeFlags(flags: flags.raw); return self }

    public var allSet: StateExEnum { return .allSet }
    public var noneSet: StateExEnum { return .noneSet }
    public var currentSet: StateExEnum { return value!.currentSet }

    public static func < (lhs: StateEx, rhs: StateEx) -> Bool {
        return lhs.raw < rhs.raw
    }

    public static func == (lhs: StateEx, rhs: StateEx) -> Bool {
        return lhs.raw == rhs.raw
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(raw)
    }

    public var description: String {
        var sb = String()
        var first = true
        if hasFlags(flags: StateEx.unknown.raw) {
            sb.append(first ? "" : "|"); sb.append("unknown")
            first = false
        }
        if hasFlags(flags: StateEx.invalid.raw) {
            sb.append(first ? "" : "|"); sb.append("invalid")
            first = false
        }
        if hasFlags(flags: StateEx.initialized.raw) {
            sb.append(first ? "" : "|"); sb.append("initialized")
            first = false
        }
        if hasFlags(flags: StateEx.calculated.raw) {
            sb.append(first ? "" : "|"); sb.append("calculated")
            first = false
        }
        if hasFlags(flags: StateEx.broken.raw) {
            sb.append(first ? "" : "|"); sb.append("broken")
            first = false
        }
        if hasFlags(flags: StateEx.happy.raw) {
            sb.append(first ? "" : "|"); sb.append("happy")
            first = false
        }
        if hasFlags(flags: StateEx.sad.raw) {
            sb.append(first ? "" : "|"); sb.append("sad")
            first = false
        }
        if hasFlags(flags: StateEx.good.raw) {
            sb.append(first ? "" : "|"); sb.append("good")
            first = false
        }
        if hasFlags(flags: StateEx.bad.raw) {
            sb.append(first ? "" : "|"); sb.append("bad")
            first = false
        }
        return sb
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> StateEx {
        return try JSONDecoder().decode(StateEx.self, from: json.data(using: .utf8)!)
    }
}
