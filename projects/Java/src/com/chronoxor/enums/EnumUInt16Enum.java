// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.6.0.0

package com.chronoxor.enums;

public enum EnumUInt16Enum
{
    ENUM_VALUE_0((short)0 + 0)
    , ENUM_VALUE_1((short)0 + 0)
    , ENUM_VALUE_2((short)0 + 1)
    , ENUM_VALUE_3((short)65534 + 0)
    , ENUM_VALUE_4((short)65534 + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.getRaw())
    ;

    private short value;

    EnumUInt16Enum(short value) { this.value = value; }
    EnumUInt16Enum(int value) { this.value = (short)value; }
    EnumUInt16Enum(EnumUInt16Enum value) { this.value = value.value; }

    public short getRaw() { return value; }

    public static EnumUInt16Enum mapValue(short value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0";
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1";
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2";
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3";
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4";
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5";
        return "<unknown>";
    }

    private static final java.util.Map<Short, EnumUInt16Enum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : EnumUInt16Enum.values())
            mapping.put(value.value, value);
    }
}
