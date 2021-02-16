// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class EnumByte : Comparable<EnumByte>
{
    companion object
    {
        val ENUM_VALUE_0 = EnumByte(EnumByteEnum.ENUM_VALUE_0)
        val ENUM_VALUE_1 = EnumByte(EnumByteEnum.ENUM_VALUE_1)
        val ENUM_VALUE_2 = EnumByte(EnumByteEnum.ENUM_VALUE_2)
        val ENUM_VALUE_3 = EnumByte(EnumByteEnum.ENUM_VALUE_3)
        val ENUM_VALUE_4 = EnumByte(EnumByteEnum.ENUM_VALUE_4)
        val ENUM_VALUE_5 = EnumByte(EnumByteEnum.ENUM_VALUE_5)
    }

    var value: EnumByteEnum? = EnumByteEnum.values()[0]
        private set

    val raw: Byte
        get() = value!!.raw

    constructor()
    constructor(value: Byte) { setEnum(value) }
    constructor(value: EnumByteEnum) { setEnum(value) }
    constructor(value: EnumByte) { setEnum(value) }

    fun setDefault() { setEnum(0.toByte()) }

    fun setEnum(value: Byte) { this.value = EnumByteEnum.mapValue(value) }
    fun setEnum(value: EnumByteEnum) { this.value = value }
    fun setEnum(value: EnumByte) { this.value = value.value }

    override fun compareTo(other: EnumByte): Int
    {
        if (value == null)
            return -1
        if (other.value == null)
            return 1
        return (value!!.raw - other.value!!.raw).toInt()
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!EnumByte::class.java.isAssignableFrom(other.javaClass))
            return false

        val enm = other as EnumByte? ?: return false

        if (enm.value == null)
            return false
        if (value!!.raw != enm.value!!.raw)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        var hash = 17
        hash = hash * 31 + if (value != null) value!!.hashCode() else 0
        return hash
    }

    override fun toString(): String
    {
        return if (value != null) value!!.toString() else "<unknown>"
    }
}
