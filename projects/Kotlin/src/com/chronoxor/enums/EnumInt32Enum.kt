// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class EnumInt32Enum
{
    ENUM_VALUE_0(0 + 0)
    , ENUM_VALUE_1(-2147483648 + 0)
    , ENUM_VALUE_2(-2147483648 + 1)
    , ENUM_VALUE_3(2147483646 + 0)
    , ENUM_VALUE_4(2147483646 + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.raw)
    ;

    var raw: Int = 0
        private set

    constructor(value: Byte) { this.raw = value.toInt() }
    constructor(value: Short) { this.raw = value.toInt() }
    constructor(value: Int) { this.raw = value.toInt() }
    constructor(value: Long) { this.raw = value.toInt() }
    constructor(value: EnumInt32Enum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0"
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1"
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2"
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3"
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4"
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = java.util.HashMap<Int, EnumInt32Enum>()

        init
        {
            for (value in EnumInt32Enum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Int): EnumInt32Enum? { return mapping[value] }
    }
}
