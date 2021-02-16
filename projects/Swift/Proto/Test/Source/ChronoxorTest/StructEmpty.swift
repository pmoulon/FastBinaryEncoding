// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

import Foundation
import ChronoxorFbe
import ChronoxorProto

public protocol StructEmptyBase {
}

public protocol StructEmptyInheritance {
    var parent: StructEmpty { get set }
}

extension StructEmptyInheritance {
}

public struct StructEmpty: StructEmptyBase, Comparable, Hashable, Codable {

    public init() { }

    public init(other: StructEmpty) {
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
    }

    public func clone() throws -> StructEmpty {
        // Serialize the struct to the FBE stream
        let writer = StructEmptyModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = StructEmptyModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: StructEmpty, rhs: StructEmpty) -> Bool {
        return true
    }

    public static func == (lhs: StructEmpty, rhs: StructEmpty) -> Bool {
        return true
    }

    public func hash(into hasher: inout Hasher) {
    }

    public var description: String {
        var sb = String()
        sb.append("StructEmpty(")
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case empty
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> StructEmpty {
        return try JSONDecoder().decode(StructEmpty.self, from: json.data(using: .utf8)!)
    }
}
