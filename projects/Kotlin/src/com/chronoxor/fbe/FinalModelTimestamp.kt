// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding timestamp final model
class FinalModelTimestamp(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    // Get the allocation size
    @Suppress("UNUSED_PARAMETER")
    fun fbeAllocationSize(value: java.time.Instant): Long = fbeSize

    // Final size
    override val fbeSize: Long = 8

    // Check if the timestamp value is valid
    override fun verify(): Long
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return Long.MAX_VALUE

        return fbeSize
    }

    // Get the timestamp value
    fun get(size: Size): java.time.Instant
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return java.time.Instant.EPOCH

        size.value = fbeSize
        val nanoseconds = readInt64(fbeOffset)
        return java.time.Instant.ofEpochSecond(nanoseconds / 1000000000, nanoseconds % 1000000000)
    }

    // Set the timestamp value
    fun set(value: java.time.Instant): Long
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val nanoseconds = value.epochSecond * 1000000000 + value.nano
        write(fbeOffset, nanoseconds.toULong())
        return fbeSize
    }
}
