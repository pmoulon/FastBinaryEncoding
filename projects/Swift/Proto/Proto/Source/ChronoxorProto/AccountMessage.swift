// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

import Foundation
import ChronoxorFbe

public struct AccountMessage: Comparable, Hashable, Codable {
    public var body: Account = ChronoxorProto.Account()

    public init() { }
    public init(body: Account) {

        self.body = body
    }

    public init(other: AccountMessage) {
        self.body = other.body
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        body = try container.decode(ChronoxorProto.Account.self, forKey: .body)
    }

    public func clone() throws -> AccountMessage {
        // Serialize the struct to the FBE stream
        let writer = AccountMessageModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = AccountMessageModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: AccountMessage, rhs: AccountMessage) -> Bool {
        return true
    }

    public static func == (lhs: AccountMessage, rhs: AccountMessage) -> Bool {
        return true
    }

    public func hash(into hasher: inout Hasher) {
    }

    public var description: String {
        var sb = String()
        sb.append("AccountMessage(")
        sb.append("body="); sb.append(body.description)
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case body
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(body, forKey: .body)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> AccountMessage {
        return try JSONDecoder().decode(AccountMessage.self, from: json.data(using: .utf8)!)
    }
}