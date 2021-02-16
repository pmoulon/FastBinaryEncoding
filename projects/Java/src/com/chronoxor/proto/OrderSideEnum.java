// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.6.0.0

package com.chronoxor.proto;

public enum OrderSideEnum
{
    buy((byte)0 + 0)
    , sell((byte)0 + 1)
    ;

    private byte value;

    OrderSideEnum(byte value) { this.value = value; }
    OrderSideEnum(int value) { this.value = (byte)value; }
    OrderSideEnum(OrderSideEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static OrderSideEnum mapValue(byte value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == buy) return "buy";
        if (this == sell) return "sell";
        return "<unknown>";
    }

    private static final java.util.Map<Byte, OrderSideEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : OrderSideEnum.values())
            mapping.put(value.value, value);
    }
}
