// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.6.0.0

import ChronoxorFbe

// Fast Binary Encoding Balance final model
public class FinalModelBalance: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int

    let currency: ChronoxorFbe.FinalModelString
    let amount: ChronoxorFbe.FinalModelDouble

    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = 2

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        currency = FinalModelString(buffer: buffer, offset: 0)
        amount = FinalModelDouble(buffer: buffer, offset: 0)
    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: Balance) -> Int {
        return 0
            + currency.fbeAllocationSize(value: fbeValue.currency)
            + amount.fbeAllocationSize(value: fbeValue.amount)
    }

    // Check if the struct value is valid
    public func verify() -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeResult = verifyFields()
        _buffer.unshift(offset: fbeOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    public func verifyFields() -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeFieldSize: Int = 0

        currency.fbeOffset = fbeCurrentOffset
        fbeFieldSize = currency.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        amount.fbeOffset = fbeCurrentOffset
        fbeFieldSize = amount.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    public func get(size: inout Size) -> Balance {
        var fbeValue = Balance()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout Balance) -> Balance {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout Balance) -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        var fbeFieldSize = Size()

        currency.fbeOffset = fbeCurrentOffset
        fbeValue.currency = currency.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        amount.fbeOffset = fbeCurrentOffset
        fbeValue.amount = amount.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    public func set(value fbeValue: Balance) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: Balance) throws -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        let fbeFieldSize = Size()

        currency.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try currency.set(value: fbeValue.currency)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        amount.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try amount.set(value: fbeValue.amount)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
