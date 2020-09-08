// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.3.0.0

package com.chronoxor.fbe;

// Fast Binary Encoding decimal field model
public final class FieldModelDecimal extends FieldModel
{
    public FieldModelDecimal(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 16; }

    // Get the decimal value
    public java.math.BigDecimal get() { return get(java.math.BigDecimal.valueOf(0L)); }
    public java.math.BigDecimal get(java.math.BigDecimal defaults)
    {
        assert (defaults != null) : "Invalid default decimal value!";
        if (defaults == null)
            throw new IllegalArgumentException("Invalid default decimal value!");

        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        byte[] magnitude = readBytes(fbeOffset(), 12);
        int scale = readByte(fbeOffset() + 14);
        int signum = (readByte(fbeOffset() + 15) < 0) ? -1 : 1;

        // Reverse magnitude
        for(int i = 0; i < magnitude.length / 2; i++)
        {
            byte temp = magnitude[i];
            magnitude[i] = magnitude[magnitude.length - i - 1];
            magnitude[magnitude.length - i - 1] = temp;
        }

        var unscaled = new java.math.BigInteger(signum, magnitude);

        return new java.math.BigDecimal(unscaled, scale);
    }

    // Set the decimal value
    public void set(java.math.BigDecimal value)
    {
        assert (value != null) : "Invalid decimal value!";
        if (value == null)
            throw new IllegalArgumentException("Invalid decimal value!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        // Get unscaled absolute value
        java.math.BigInteger unscaled = value.abs().unscaledValue();
        int bitLength = unscaled.bitLength();
        if ((bitLength < 0) || (bitLength > 96))
        {
            // Value too big for .NET Decimal (bit length is limited to [0, 96])
            write(fbeOffset(), (byte)0, fbeSize());
            return;
        }

        // Get byte array
        byte[] unscaledBytes = unscaled.toByteArray();

        // Get scale
        int scale = value.scale();
        if ((scale < 0) || (scale > 28))
        {
            // Value scale exceeds .NET Decimal limit of [0, 28]
            write(fbeOffset(), (byte)0, fbeSize());
            return;
        }

        // Write unscaled value to bytes 0-11
        int index = 0;
        for (int i = unscaledBytes.length - 1; (i >= 0) && (index < 12); i--, index++)
            write(fbeOffset() + index, unscaledBytes[i]);

        // Fill remaining bytes with zeros
        for (; index < 14; index++)
            write(fbeOffset() + index, (byte)0);

        // Write scale at byte 14
        write(fbeOffset() + 14, (byte)scale);

        // Write signum at byte 15
        write(fbeOffset() + 15, (byte)((value.signum() < 0) ? -128 : 0));
    }
}
