// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class FlagsEmpty : Comparable<FlagsEmpty>
{
    companion object
    {
        @Suppress("UNUSED_PARAMETER")
        fun fromSet(set: java.util.EnumSet<FlagsEmptyEnum>): FlagsEmpty
        {
            @Suppress("CanBeVal")
            var result = 0
            return FlagsEmpty(result.toInt())
        }
    }

    var value: FlagsEmptyEnum? = FlagsEmptyEnum.values()[0]
        private set

    var raw: Int = value!!.raw
        private set

    constructor()
    constructor(value: Int) { setEnum(value) }
    constructor(value: FlagsEmptyEnum) { setEnum(value) }
    constructor(value: java.util.EnumSet<FlagsEmptyEnum>) { setEnum(value) }
    constructor(value: FlagsEmpty) { setEnum(value) }

    fun setDefault() { setEnum(0.toInt()) }

    fun setEnum(value: Int) { this.raw = value; this.value = FlagsEmptyEnum.mapValue(value) }
    fun setEnum(value: FlagsEmptyEnum) { this.value = value; this.raw = value.raw; }
    fun setEnum(value: java.util.EnumSet<FlagsEmptyEnum>) { setEnum(FlagsEmpty.fromSet(value)) }
    fun setEnum(value: FlagsEmpty) { this.value = value.value; this.raw = value.raw }

    fun hasFlags(flags: Int): Boolean = ((raw.toInt() and flags.toInt()) != 0) && ((raw.toInt() and flags.toInt()) == flags.toInt())
    fun hasFlags(flags: FlagsEmptyEnum): Boolean = hasFlags(flags.raw)
    fun hasFlags(flags: FlagsEmpty): Boolean = hasFlags(flags.raw)

    fun setFlags(flags: Int): FlagsEmpty { setEnum((raw.toInt() or flags.toInt()).toInt()); return this }
    fun setFlags(flags: FlagsEmptyEnum): FlagsEmpty { setFlags(flags.raw); return this }
    fun setFlags(flags: FlagsEmpty): FlagsEmpty { setFlags(flags.raw); return this }

    fun removeFlags(flags: Int): FlagsEmpty { setEnum((raw.toInt() and flags.toInt().inv()).toInt()); return this }
    fun removeFlags(flags: FlagsEmptyEnum): FlagsEmpty { removeFlags(flags.raw); return this }
    fun removeFlags(flags: FlagsEmpty): FlagsEmpty { removeFlags(flags.raw); return this }

    val allSet: java.util.EnumSet<FlagsEmptyEnum> get() = value!!.allSet
    val noneSet: java.util.EnumSet<FlagsEmptyEnum> get() = value!!.noneSet
    val currentSet: java.util.EnumSet<FlagsEmptyEnum> get() = value!!.currentSet

    override fun compareTo(other: FlagsEmpty): Int
    {
        return (raw - other.raw).toInt()
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!FlagsEmpty::class.java.isAssignableFrom(other.javaClass))
            return false

        val flg = other as FlagsEmpty? ?: return false

        if (raw != flg.raw)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        var hash = 17
        hash = hash * 31 + raw.toInt()
        return hash.toInt()
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        return sb.toString()
    }
}
