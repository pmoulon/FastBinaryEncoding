// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

import Foundation
import ChronoxorFbe
import ChronoxorProto

public protocol StructMapBase: Comparable, Hashable, Codable {
    var f1: Dictionary<Int32, UInt8> { get set }
    var f2: Dictionary<Int32, UInt8?> { get set }
    var f3: Dictionary<Int32, Data> { get set }
    var f4: Dictionary<Int32, Data?> { get set }
    var f5: Dictionary<Int32, EnumSimple> { get set }
    var f6: Dictionary<Int32, EnumSimple?> { get set }
    var f7: Dictionary<Int32, FlagsSimple> { get set }
    var f8: Dictionary<Int32, FlagsSimple?> { get set }
    var f9: Dictionary<Int32, StructSimple> { get set }
    var f10: Dictionary<Int32, StructSimple?> { get set }
}

public protocol StructMapInheritance {
    var parent: StructMap { get set }
}

extension StructMapInheritance {
    public var f1: Dictionary<Int32, UInt8> {
        get { return parent.f1 }
        set { parent.f1 = newValue }
    }
    public var f2: Dictionary<Int32, UInt8?> {
        get { return parent.f2 }
        set { parent.f2 = newValue }
    }
    public var f3: Dictionary<Int32, Data> {
        get { return parent.f3 }
        set { parent.f3 = newValue }
    }
    public var f4: Dictionary<Int32, Data?> {
        get { return parent.f4 }
        set { parent.f4 = newValue }
    }
    public var f5: Dictionary<Int32, EnumSimple> {
        get { return parent.f5 }
        set { parent.f5 = newValue }
    }
    public var f6: Dictionary<Int32, EnumSimple?> {
        get { return parent.f6 }
        set { parent.f6 = newValue }
    }
    public var f7: Dictionary<Int32, FlagsSimple> {
        get { return parent.f7 }
        set { parent.f7 = newValue }
    }
    public var f8: Dictionary<Int32, FlagsSimple?> {
        get { return parent.f8 }
        set { parent.f8 = newValue }
    }
    public var f9: Dictionary<Int32, StructSimple> {
        get { return parent.f9 }
        set { parent.f9 = newValue }
    }
    public var f10: Dictionary<Int32, StructSimple?> {
        get { return parent.f10 }
        set { parent.f10 = newValue }
    }
}

public struct StructMap: StructMapBase {
    public var f1: Dictionary<Int32, UInt8> = Dictionary()
    public var f2: Dictionary<Int32, UInt8?> = Dictionary()
    public var f3: Dictionary<Int32, Data> = Dictionary()
    public var f4: Dictionary<Int32, Data?> = Dictionary()
    public var f5: Dictionary<Int32, EnumSimple> = Dictionary()
    public var f6: Dictionary<Int32, EnumSimple?> = Dictionary()
    public var f7: Dictionary<Int32, FlagsSimple> = Dictionary()
    public var f8: Dictionary<Int32, FlagsSimple?> = Dictionary()
    public var f9: Dictionary<Int32, StructSimple> = Dictionary()
    public var f10: Dictionary<Int32, StructSimple?> = Dictionary()

    public init() { }
    public init(f1: Dictionary<Int32, UInt8>, f2: Dictionary<Int32, UInt8?>, f3: Dictionary<Int32, Data>, f4: Dictionary<Int32, Data?>, f5: Dictionary<Int32, EnumSimple>, f6: Dictionary<Int32, EnumSimple?>, f7: Dictionary<Int32, FlagsSimple>, f8: Dictionary<Int32, FlagsSimple?>, f9: Dictionary<Int32, StructSimple>, f10: Dictionary<Int32, StructSimple?>) {

        self.f1 = f1
        self.f2 = f2
        self.f3 = f3
        self.f4 = f4
        self.f5 = f5
        self.f6 = f6
        self.f7 = f7
        self.f8 = f8
        self.f9 = f9
        self.f10 = f10
    }

    public init(other: StructMap) {
        self.f1 = other.f1
        self.f2 = other.f2
        self.f3 = other.f3
        self.f4 = other.f4
        self.f5 = other.f5
        self.f6 = other.f6
        self.f7 = other.f7
        self.f8 = other.f8
        self.f9 = other.f9
        self.f10 = other.f10
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        f1 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, UInt8>.self, forKey: .f1)).map { (Int32($0) ?? 0, $1) })
        f2 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, UInt8?>.self, forKey: .f2)).map { (Int32($0) ?? 0, $1) })
        f3 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, Data>.self, forKey: .f3)).map { (Int32($0) ?? 0, $1) })
        f4 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, Data?>.self, forKey: .f4)).map { (Int32($0) ?? 0, $1) })
        f5 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, EnumSimple>.self, forKey: .f5)).map { (Int32($0) ?? 0, $1) })
        f6 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, EnumSimple?>.self, forKey: .f6)).map { (Int32($0) ?? 0, $1) })
        f7 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, FlagsSimple>.self, forKey: .f7)).map { (Int32($0) ?? 0, $1) })
        f8 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, FlagsSimple?>.self, forKey: .f8)).map { (Int32($0) ?? 0, $1) })
        f9 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, StructSimple>.self, forKey: .f9)).map { (Int32($0) ?? 0, $1) })
        f10 = Dictionary(uniqueKeysWithValues: (try container.decode(Dictionary<String, StructSimple?>.self, forKey: .f10)).map { (Int32($0) ?? 0, $1) })
    }

    public func clone() throws -> StructMap {
        // Serialize the struct to the FBE stream
        let writer = StructMapModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = StructMapModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: StructMap, rhs: StructMap) -> Bool {
        return true
    }

    public static func == (lhs: StructMap, rhs: StructMap) -> Bool {
        return true
    }

    public func hash(into hasher: inout Hasher) {
    }

    public var description: String {
        var sb = String()
        sb.append("StructMap(")
        if true {
            var first = true
            sb.append("f1=["); sb.append(f1.count.description); sb.append("]<{")
            for (key, value) in f1 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                sb.append(value.description)
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f2=["); sb.append(f2.count.description); sb.append("]<{")
            for (key, value) in f2 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                 if let value = value { sb.append(value.description) } else { sb.append("null") }
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f3=["); sb.append(f3.count.description); sb.append("]<{")
            for (key, value) in f3 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                sb.append("bytes["); sb.append("\(value.count)"); sb.append("]")
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f4=["); sb.append(f4.count.description); sb.append("]<{")
            for (key, value) in f4 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                 if let value = value { sb.append("bytes["); sb.append("\(value.count)"); sb.append("]") } else { sb.append("null") }
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f5=["); sb.append(f5.count.description); sb.append("]<{")
            for (key, value) in f5 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                sb.append(value.description)
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f6=["); sb.append(f6.count.description); sb.append("]<{")
            for (key, value) in f6 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                 if let value = value { sb.append(value.description) } else { sb.append("null") }
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f7=["); sb.append(f7.count.description); sb.append("]<{")
            for (key, value) in f7 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                sb.append(value.description)
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f8=["); sb.append(f8.count.description); sb.append("]<{")
            for (key, value) in f8 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                 if let value = value { sb.append(value.description) } else { sb.append("null") }
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f9=["); sb.append(f9.count.description); sb.append("]<{")
            for (key, value) in f9 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                sb.append(value.description)
                first = false
            }
            sb.append("}>")
        }
        if true {
            var first = true
            sb.append(",f10=["); sb.append(f10.count.description); sb.append("]<{")
            for (key, value) in f10 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                 if let value = value { sb.append(value.description) } else { sb.append("null") }
                first = false
            }
            sb.append("}>")
        }
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case f1
        case f2
        case f3
        case f4
        case f5
        case f6
        case f7
        case f8
        case f9
        case f10
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(Dictionary(uniqueKeysWithValues: f1.map { ($0.description, $1) }), forKey: .f1)
        try container.encode(Dictionary(uniqueKeysWithValues: f2.map { ($0.description, $1) }), forKey: .f2)
        try container.encode(Dictionary(uniqueKeysWithValues: f3.map { ($0.description, $1) }), forKey: .f3)
        try container.encode(Dictionary(uniqueKeysWithValues: f4.map { ($0.description, $1) }), forKey: .f4)
        try container.encode(Dictionary(uniqueKeysWithValues: f5.map { ($0.description, $1) }), forKey: .f5)
        try container.encode(Dictionary(uniqueKeysWithValues: f6.map { ($0.description, $1) }), forKey: .f6)
        try container.encode(Dictionary(uniqueKeysWithValues: f7.map { ($0.description, $1) }), forKey: .f7)
        try container.encode(Dictionary(uniqueKeysWithValues: f8.map { ($0.description, $1) }), forKey: .f8)
        try container.encode(Dictionary(uniqueKeysWithValues: f9.map { ($0.description, $1) }), forKey: .f9)
        try container.encode(Dictionary(uniqueKeysWithValues: f10.map { ($0.description, $1) }), forKey: .f10)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> StructMap {
        return try JSONDecoder().decode(StructMap.self, from: json.data(using: .utf8)!)
    }
}
