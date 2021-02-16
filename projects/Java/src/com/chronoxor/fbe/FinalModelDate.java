// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.6.0.0

package com.chronoxor.fbe;

// Fast Binary Encoding date final model
public final class FinalModelDate extends FinalModel
{
    public FinalModelDate(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(java.util.Date value) { return fbeSize(); }

    // Get the final size
    @Override
    public long fbeSize() { return 8; }

    // Check if the date value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return fbeSize();
    }

    // Get the date value
    public java.util.Date get(Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return new java.util.Date(0);

        size.value = fbeSize();
        long nanoseconds = readInt64(fbeOffset());
        return new java.util.Date(nanoseconds / 1000000);
    }

    // Set the date value
    public long set(java.util.Date value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        long nanoseconds = value.getTime() * 1000;
        write(fbeOffset(), nanoseconds);
        return fbeSize();
    }
}
