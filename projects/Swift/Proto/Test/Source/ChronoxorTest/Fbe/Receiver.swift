// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding ChronoxorTest receiver
open class Receiver: ChronoxorFbe.ReceiverProtocol {
    // Imported receivers
    let ProtoReceiver: ChronoxorProto.Receiver?

    // Receiver values accessors

    // Receiver models accessors

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        ProtoReceiver = ChronoxorProto.Receiver(buffer: buffer)
        build(final: false)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        ProtoReceiver = ChronoxorProto.Receiver(buffer: buffer)
        build(with: buffer, final: false)
    }

    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? ReceiverListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: ReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {

        if let ProtoReceiver = ProtoReceiver, ProtoReceiver.onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size) {
            return true
        }

        return false
    }
}
