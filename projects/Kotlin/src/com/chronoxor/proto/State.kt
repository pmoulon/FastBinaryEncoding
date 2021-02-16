// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class State : Comparable<State>
{
    companion object
    {
        val unknown = State(StateEnum.unknown)
        val invalid = State(StateEnum.invalid)
        val initialized = State(StateEnum.initialized)
        val calculated = State(StateEnum.calculated)
        val broken = State(StateEnum.broken)
        val good = State(StateEnum.good)
        val bad = State(StateEnum.bad)

        fun fromSet(set: java.util.EnumSet<StateEnum>): State
        {
            @Suppress("CanBeVal")
            var result = 0
            if (set.contains(unknown.value!!))
            {
                result = result.toInt() or unknown.raw.toInt()
            }
            if (set.contains(invalid.value!!))
            {
                result = result.toInt() or invalid.raw.toInt()
            }
            if (set.contains(initialized.value!!))
            {
                result = result.toInt() or initialized.raw.toInt()
            }
            if (set.contains(calculated.value!!))
            {
                result = result.toInt() or calculated.raw.toInt()
            }
            if (set.contains(broken.value!!))
            {
                result = result.toInt() or broken.raw.toInt()
            }
            if (set.contains(good.value!!))
            {
                result = result.toInt() or good.raw.toInt()
            }
            if (set.contains(bad.value!!))
            {
                result = result.toInt() or bad.raw.toInt()
            }
            return State(result.toByte())
        }
    }

    var value: StateEnum? = StateEnum.values()[0]
        private set

    var raw: Byte = value!!.raw
        private set

    constructor()
    constructor(value: Byte) { setEnum(value) }
    constructor(value: StateEnum) { setEnum(value) }
    constructor(value: java.util.EnumSet<StateEnum>) { setEnum(value) }
    constructor(value: State) { setEnum(value) }

    fun setDefault() { setEnum(0.toByte()) }

    fun setEnum(value: Byte) { this.raw = value; this.value = StateEnum.mapValue(value) }
    fun setEnum(value: StateEnum) { this.value = value; this.raw = value.raw; }
    fun setEnum(value: java.util.EnumSet<StateEnum>) { setEnum(State.fromSet(value)) }
    fun setEnum(value: State) { this.value = value.value; this.raw = value.raw }

    fun hasFlags(flags: Byte): Boolean = ((raw.toInt() and flags.toInt()) != 0) && ((raw.toInt() and flags.toInt()) == flags.toInt())
    fun hasFlags(flags: StateEnum): Boolean = hasFlags(flags.raw)
    fun hasFlags(flags: State): Boolean = hasFlags(flags.raw)

    fun setFlags(flags: Byte): State { setEnum((raw.toInt() or flags.toInt()).toByte()); return this }
    fun setFlags(flags: StateEnum): State { setFlags(flags.raw); return this }
    fun setFlags(flags: State): State { setFlags(flags.raw); return this }

    fun removeFlags(flags: Byte): State { setEnum((raw.toInt() and flags.toInt().inv()).toByte()); return this }
    fun removeFlags(flags: StateEnum): State { removeFlags(flags.raw); return this }
    fun removeFlags(flags: State): State { removeFlags(flags.raw); return this }

    val allSet: java.util.EnumSet<StateEnum> get() = value!!.allSet
    val noneSet: java.util.EnumSet<StateEnum> get() = value!!.noneSet
    val currentSet: java.util.EnumSet<StateEnum> get() = value!!.currentSet

    override fun compareTo(other: State): Int
    {
        return (raw - other.raw).toInt()
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!State::class.java.isAssignableFrom(other.javaClass))
            return false

        val flg = other as State? ?: return false

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
        var first = true
        if (hasFlags(unknown.raw))
        {
            sb.append(if (first) "" else "|").append("unknown")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(invalid.raw))
        {
            sb.append(if (first) "" else "|").append("invalid")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(initialized.raw))
        {
            sb.append(if (first) "" else "|").append("initialized")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(calculated.raw))
        {
            sb.append(if (first) "" else "|").append("calculated")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(broken.raw))
        {
            sb.append(if (first) "" else "|").append("broken")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(good.raw))
        {
            sb.append(if (first) "" else "|").append("good")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        if (hasFlags(bad.raw))
        {
            sb.append(if (first) "" else "|").append("bad")
            @Suppress("UNUSED_VALUE")
            first = false
        }
        return sb.toString()
    }
}
