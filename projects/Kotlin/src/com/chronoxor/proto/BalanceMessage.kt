// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class BalanceMessage : Comparable<Any?>
{
    var body: Balance

    @Transient open var fbeType: Long = 2

    constructor(body: Balance = Balance())
    {
        this.body = body
    }

    @Suppress("UNUSED_PARAMETER")
    constructor(other: BalanceMessage)
    {
        this.body = other.body
    }

    open fun clone(): BalanceMessage
    {
        // Serialize the struct to the FBE stream
        val writer = com.chronoxor.proto.fbe.BalanceMessageModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = com.chronoxor.proto.fbe.BalanceMessageModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!BalanceMessage::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as BalanceMessage? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!BalanceMessage::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as BalanceMessage? ?: return false

        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("BalanceMessage(")
        sb.append("body="); sb.append(body)
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = com.chronoxor.proto.fbe.Json.engine.toJson(this)

    companion object
    {
        const val fbeTypeConst: Long = 2
        fun fromJson(json: String): BalanceMessage = com.chronoxor.proto.fbe.Json.engine.fromJson(json, BalanceMessage::class.java)
    }
}
