// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding EnumTyped final model
class FinalModelEnumTyped(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FinalModel(buffer, offset)
{
    // Get the allocation size
    @Suppress("UNUSED_PARAMETER")
    fun fbeAllocationSize(value: com.chronoxor.test.EnumTyped): Long = fbeSize

    // Final size
    override val fbeSize: Long = 1

    // Check if the value is valid
    override fun verify(): Long
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return Long.MAX_VALUE

        return fbeSize
    }

    // Get the value
    fun get(size: com.chronoxor.fbe.Size): com.chronoxor.test.EnumTyped
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return com.chronoxor.test.EnumTyped()

        size.value = fbeSize
        return com.chronoxor.test.EnumTyped(readInt8(fbeOffset))
    }

    // Set the value
    fun set(value: com.chronoxor.test.EnumTyped): Long
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        write(fbeOffset, value.raw)
        return fbeSize
    }
}
