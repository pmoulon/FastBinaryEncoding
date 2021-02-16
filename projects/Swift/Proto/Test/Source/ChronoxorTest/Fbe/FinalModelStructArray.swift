// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding StructArray final model
public class FinalModelStructArray: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int

    let f1: FinalModelArrayUInt8
    let f2: FinalModelArrayOptionalUInt8
    let f3: FinalModelArrayData
    let f4: FinalModelArrayOptionalData
    let f5: FinalModelArrayEnumSimple
    let f6: FinalModelArrayOptionalEnumSimple
    let f7: FinalModelArrayFlagsSimple
    let f8: FinalModelArrayOptionalFlagsSimple
    let f9: FinalModelArrayStructSimple
    let f10: FinalModelArrayOptionalStructSimple

    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = 125

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        f1 = FinalModelArrayUInt8(buffer: buffer, offset: 0, size: 2)
        f2 = FinalModelArrayOptionalUInt8(buffer: buffer, offset: 0, size: 2)
        f3 = FinalModelArrayData(buffer: buffer, offset: 0, size: 2)
        f4 = FinalModelArrayOptionalData(buffer: buffer, offset: 0, size: 2)
        f5 = FinalModelArrayEnumSimple(buffer: buffer, offset: 0, size: 2)
        f6 = FinalModelArrayOptionalEnumSimple(buffer: buffer, offset: 0, size: 2)
        f7 = FinalModelArrayFlagsSimple(buffer: buffer, offset: 0, size: 2)
        f8 = FinalModelArrayOptionalFlagsSimple(buffer: buffer, offset: 0, size: 2)
        f9 = FinalModelArrayStructSimple(buffer: buffer, offset: 0, size: 2)
        f10 = FinalModelArrayOptionalStructSimple(buffer: buffer, offset: 0, size: 2)
    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: StructArray) -> Int {
        return 0
            + f1.fbeAllocationSize(value: fbeValue.f1)
            + f2.fbeAllocationSize(value: fbeValue.f2)
            + f3.fbeAllocationSize(value: fbeValue.f3)
            + f4.fbeAllocationSize(value: fbeValue.f4)
            + f5.fbeAllocationSize(value: fbeValue.f5)
            + f6.fbeAllocationSize(value: fbeValue.f6)
            + f7.fbeAllocationSize(value: fbeValue.f7)
            + f8.fbeAllocationSize(value: fbeValue.f8)
            + f9.fbeAllocationSize(value: fbeValue.f9)
            + f10.fbeAllocationSize(value: fbeValue.f10)
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

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f2.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f3.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f3.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f4.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f4.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f5.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f5.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f6.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f6.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f7.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f7.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f8.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f8.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f9.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f9.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        f10.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f10.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    public func get(size: inout Size) -> StructArray {
        var fbeValue = StructArray()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout StructArray) -> StructArray {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout StructArray) -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        var fbeFieldSize = Size()

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f1.get(values: &fbeValue.f1)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f2.get(values: &fbeValue.f2)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f3.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f3.get(values: &fbeValue.f3)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f4.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f4.get(values: &fbeValue.f4)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f5.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f5.get(values: &fbeValue.f5)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f6.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f6.get(values: &fbeValue.f6)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f7.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f7.get(values: &fbeValue.f7)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f8.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f8.get(values: &fbeValue.f8)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f9.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f9.get(values: &fbeValue.f9)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f10.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f10.get(values: &fbeValue.f10)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    public func set(value fbeValue: StructArray) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: StructArray) throws -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        let fbeFieldSize = Size()

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f1.set(value: fbeValue.f1)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f2.set(value: fbeValue.f2)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f3.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f3.set(value: fbeValue.f3)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f4.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f4.set(value: fbeValue.f4)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f5.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f5.set(value: fbeValue.f5)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f6.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f6.set(value: fbeValue.f6)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f7.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f7.set(value: fbeValue.f7)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f8.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f8.set(value: fbeValue.f8)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f9.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f9.set(value: fbeValue.f9)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f10.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try f10.set(value: fbeValue.f10)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
