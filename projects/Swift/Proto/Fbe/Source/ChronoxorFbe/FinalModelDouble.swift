// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.3.0.0

import Foundation

// Fast Binary Encoding Double final model
public class FinalModelDouble: FinalModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    public init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    // Get the allocation size
    public func fbeAllocationSize(value: Double) -> Int {
        return fbeSize
    }

    // Field size
    public let fbeSize: Int = 8

    // Check if the value is valid
    public func verify() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return Int.max
        }

        return fbeSize
    }

    // Get the value
    public func get(size: inout Size) -> Double {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return 0.0
        }

        size.value = fbeSize
        return readDouble(offset: fbeOffset)
    }

    // Set the value
    public func set(value: Double) throws -> Int {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: value)
        return fbeSize
    }
}
