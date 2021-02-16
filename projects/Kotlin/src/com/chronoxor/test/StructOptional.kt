// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class StructOptional : StructSimple
{
    var f100: Boolean?
    var f101: Boolean?
    var f102: Boolean?
    var f103: Byte?
    var f104: Byte?
    var f105: Byte?
    var f106: Char?
    var f107: Char?
    var f108: Char?
    var f109: Char?
    var f110: Char?
    var f111: Char?
    var f112: Byte?
    var f113: Byte?
    var f114: Byte?
    var f115: UByte?
    var f116: UByte?
    var f117: UByte?
    var f118: Short?
    var f119: Short?
    var f120: Short?
    var f121: UShort?
    var f122: UShort?
    var f123: UShort?
    var f124: Int?
    var f125: Int?
    var f126: Int?
    var f127: UInt?
    var f128: UInt?
    var f129: UInt?
    var f130: Long?
    var f131: Long?
    var f132: Long?
    var f133: ULong?
    var f134: ULong?
    var f135: ULong?
    var f136: Float?
    var f137: Float?
    var f138: Float?
    var f139: Double?
    var f140: Double?
    var f141: Double?
    var f142: java.math.BigDecimal?
    var f143: java.math.BigDecimal?
    var f144: java.math.BigDecimal?
    var f145: String?
    var f146: String?
    var f147: String?
    var f148: java.time.Instant?
    var f149: java.time.Instant?
    var f150: java.time.Instant?
    var f151: java.util.UUID?
    var f152: java.util.UUID?
    var f153: java.util.UUID?
    var f154: com.chronoxor.proto.OrderSide?
    var f155: com.chronoxor.proto.OrderSide?
    var f156: com.chronoxor.proto.OrderType?
    var f157: com.chronoxor.proto.OrderType?
    var f158: com.chronoxor.proto.Order?
    var f159: com.chronoxor.proto.Order?
    var f160: com.chronoxor.proto.Balance?
    var f161: com.chronoxor.proto.Balance?
    var f162: com.chronoxor.proto.State?
    var f163: com.chronoxor.proto.State?
    var f164: com.chronoxor.proto.Account?
    var f165: com.chronoxor.proto.Account?

    @Transient override var fbeType: Long = 111

    constructor(parent: StructSimple = StructSimple(), f100: Boolean? = null, f101: Boolean? = true, f102: Boolean? = null, f103: Byte? = null, f104: Byte? = 0xFF.toByte(), f105: Byte? = null, f106: Char? = null, f107: Char? = '!'.toChar(), f108: Char? = null, f109: Char? = null, f110: Char? = 0x0444.toChar(), f111: Char? = null, f112: Byte? = null, f113: Byte? = Byte.MAX_VALUE, f114: Byte? = null, f115: UByte? = null, f116: UByte? = UByte.MAX_VALUE, f117: UByte? = null, f118: Short? = null, f119: Short? = Short.MAX_VALUE, f120: Short? = null, f121: UShort? = null, f122: UShort? = UShort.MAX_VALUE, f123: UShort? = null, f124: Int? = null, f125: Int? = Int.MAX_VALUE, f126: Int? = null, f127: UInt? = null, f128: UInt? = UInt.MAX_VALUE, f129: UInt? = null, f130: Long? = null, f131: Long? = Long.MAX_VALUE, f132: Long? = null, f133: ULong? = null, f134: ULong? = ULong.MAX_VALUE, f135: ULong? = null, f136: Float? = null, f137: Float? = 123.456f, f138: Float? = null, f139: Double? = null, f140: Double? = -123.456e+123, f141: Double? = null, f142: java.math.BigDecimal? = null, f143: java.math.BigDecimal? = java.math.BigDecimal.valueOf(123456.123456), f144: java.math.BigDecimal? = null, f145: String? = null, f146: String? = "Initial string!", f147: String? = null, f148: java.time.Instant? = null, f149: java.time.Instant? = java.time.Instant.now(), f150: java.time.Instant? = null, f151: java.util.UUID? = null, f152: java.util.UUID? = java.util.UUID.fromString("123e4567-e89b-12d3-a456-426655440000"), f153: java.util.UUID? = null, f154: com.chronoxor.proto.OrderSide? = null, f155: com.chronoxor.proto.OrderSide? = null, f156: com.chronoxor.proto.OrderType? = null, f157: com.chronoxor.proto.OrderType? = null, f158: com.chronoxor.proto.Order? = null, f159: com.chronoxor.proto.Order? = null, f160: com.chronoxor.proto.Balance? = null, f161: com.chronoxor.proto.Balance? = null, f162: com.chronoxor.proto.State? = null, f163: com.chronoxor.proto.State? = null, f164: com.chronoxor.proto.Account? = null, f165: com.chronoxor.proto.Account? = null): super(parent)
    {
        this.f100 = f100
        this.f101 = f101
        this.f102 = f102
        this.f103 = f103
        this.f104 = f104
        this.f105 = f105
        this.f106 = f106
        this.f107 = f107
        this.f108 = f108
        this.f109 = f109
        this.f110 = f110
        this.f111 = f111
        this.f112 = f112
        this.f113 = f113
        this.f114 = f114
        this.f115 = f115
        this.f116 = f116
        this.f117 = f117
        this.f118 = f118
        this.f119 = f119
        this.f120 = f120
        this.f121 = f121
        this.f122 = f122
        this.f123 = f123
        this.f124 = f124
        this.f125 = f125
        this.f126 = f126
        this.f127 = f127
        this.f128 = f128
        this.f129 = f129
        this.f130 = f130
        this.f131 = f131
        this.f132 = f132
        this.f133 = f133
        this.f134 = f134
        this.f135 = f135
        this.f136 = f136
        this.f137 = f137
        this.f138 = f138
        this.f139 = f139
        this.f140 = f140
        this.f141 = f141
        this.f142 = f142
        this.f143 = f143
        this.f144 = f144
        this.f145 = f145
        this.f146 = f146
        this.f147 = f147
        this.f148 = f148
        this.f149 = f149
        this.f150 = f150
        this.f151 = f151
        this.f152 = f152
        this.f153 = f153
        this.f154 = f154
        this.f155 = f155
        this.f156 = f156
        this.f157 = f157
        this.f158 = f158
        this.f159 = f159
        this.f160 = f160
        this.f161 = f161
        this.f162 = f162
        this.f163 = f163
        this.f164 = f164
        this.f165 = f165
    }

    @Suppress("UNUSED_PARAMETER")
    constructor(other: StructOptional): super(other)
    {
        this.f100 = other.f100
        this.f101 = other.f101
        this.f102 = other.f102
        this.f103 = other.f103
        this.f104 = other.f104
        this.f105 = other.f105
        this.f106 = other.f106
        this.f107 = other.f107
        this.f108 = other.f108
        this.f109 = other.f109
        this.f110 = other.f110
        this.f111 = other.f111
        this.f112 = other.f112
        this.f113 = other.f113
        this.f114 = other.f114
        this.f115 = other.f115
        this.f116 = other.f116
        this.f117 = other.f117
        this.f118 = other.f118
        this.f119 = other.f119
        this.f120 = other.f120
        this.f121 = other.f121
        this.f122 = other.f122
        this.f123 = other.f123
        this.f124 = other.f124
        this.f125 = other.f125
        this.f126 = other.f126
        this.f127 = other.f127
        this.f128 = other.f128
        this.f129 = other.f129
        this.f130 = other.f130
        this.f131 = other.f131
        this.f132 = other.f132
        this.f133 = other.f133
        this.f134 = other.f134
        this.f135 = other.f135
        this.f136 = other.f136
        this.f137 = other.f137
        this.f138 = other.f138
        this.f139 = other.f139
        this.f140 = other.f140
        this.f141 = other.f141
        this.f142 = other.f142
        this.f143 = other.f143
        this.f144 = other.f144
        this.f145 = other.f145
        this.f146 = other.f146
        this.f147 = other.f147
        this.f148 = other.f148
        this.f149 = other.f149
        this.f150 = other.f150
        this.f151 = other.f151
        this.f152 = other.f152
        this.f153 = other.f153
        this.f154 = other.f154
        this.f155 = other.f155
        this.f156 = other.f156
        this.f157 = other.f157
        this.f158 = other.f158
        this.f159 = other.f159
        this.f160 = other.f160
        this.f161 = other.f161
        this.f162 = other.f162
        this.f163 = other.f163
        this.f164 = other.f164
        this.f165 = other.f165
    }

    override fun clone(): StructOptional
    {
        // Serialize the struct to the FBE stream
        val writer = com.chronoxor.test.fbe.StructOptionalModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = com.chronoxor.test.fbe.StructOptionalModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructOptional::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructOptional? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        result = super.compareTo(obj)
        if (result != 0)
            return result
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructOptional::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructOptional? ?: return false

        if (!super.equals(obj))
            return false
        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        hash = hash * 31 + super.hashCode()
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("StructOptional(")
        sb.append(super.toString())
        sb.append(",f100="); if (f100 != null) sb.append(if (f100!!) "true" else "false"); else sb.append("null")
        sb.append(",f101="); if (f101 != null) sb.append(if (f101!!) "true" else "false"); else sb.append("null")
        sb.append(",f102="); if (f102 != null) sb.append(if (f102!!) "true" else "false"); else sb.append("null")
        sb.append(",f103="); if (f103 != null) sb.append(f103!!); else sb.append("null")
        sb.append(",f104="); if (f104 != null) sb.append(f104!!); else sb.append("null")
        sb.append(",f105="); if (f105 != null) sb.append(f105!!); else sb.append("null")
        sb.append(",f106="); if (f106 != null) sb.append("'").append(f106!!).append("'"); else sb.append("null")
        sb.append(",f107="); if (f107 != null) sb.append("'").append(f107!!).append("'"); else sb.append("null")
        sb.append(",f108="); if (f108 != null) sb.append("'").append(f108!!).append("'"); else sb.append("null")
        sb.append(",f109="); if (f109 != null) sb.append("'").append(f109!!).append("'"); else sb.append("null")
        sb.append(",f110="); if (f110 != null) sb.append("'").append(f110!!).append("'"); else sb.append("null")
        sb.append(",f111="); if (f111 != null) sb.append("'").append(f111!!).append("'"); else sb.append("null")
        sb.append(",f112="); if (f112 != null) sb.append(f112!!); else sb.append("null")
        sb.append(",f113="); if (f113 != null) sb.append(f113!!); else sb.append("null")
        sb.append(",f114="); if (f114 != null) sb.append(f114!!); else sb.append("null")
        sb.append(",f115="); if (f115 != null) sb.append(f115!!); else sb.append("null")
        sb.append(",f116="); if (f116 != null) sb.append(f116!!); else sb.append("null")
        sb.append(",f117="); if (f117 != null) sb.append(f117!!); else sb.append("null")
        sb.append(",f118="); if (f118 != null) sb.append(f118!!); else sb.append("null")
        sb.append(",f119="); if (f119 != null) sb.append(f119!!); else sb.append("null")
        sb.append(",f120="); if (f120 != null) sb.append(f120!!); else sb.append("null")
        sb.append(",f121="); if (f121 != null) sb.append(f121!!); else sb.append("null")
        sb.append(",f122="); if (f122 != null) sb.append(f122!!); else sb.append("null")
        sb.append(",f123="); if (f123 != null) sb.append(f123!!); else sb.append("null")
        sb.append(",f124="); if (f124 != null) sb.append(f124!!); else sb.append("null")
        sb.append(",f125="); if (f125 != null) sb.append(f125!!); else sb.append("null")
        sb.append(",f126="); if (f126 != null) sb.append(f126!!); else sb.append("null")
        sb.append(",f127="); if (f127 != null) sb.append(f127!!); else sb.append("null")
        sb.append(",f128="); if (f128 != null) sb.append(f128!!); else sb.append("null")
        sb.append(",f129="); if (f129 != null) sb.append(f129!!); else sb.append("null")
        sb.append(",f130="); if (f130 != null) sb.append(f130!!); else sb.append("null")
        sb.append(",f131="); if (f131 != null) sb.append(f131!!); else sb.append("null")
        sb.append(",f132="); if (f132 != null) sb.append(f132!!); else sb.append("null")
        sb.append(",f133="); if (f133 != null) sb.append(f133!!); else sb.append("null")
        sb.append(",f134="); if (f134 != null) sb.append(f134!!); else sb.append("null")
        sb.append(",f135="); if (f135 != null) sb.append(f135!!); else sb.append("null")
        sb.append(",f136="); if (f136 != null) sb.append(f136!!); else sb.append("null")
        sb.append(",f137="); if (f137 != null) sb.append(f137!!); else sb.append("null")
        sb.append(",f138="); if (f138 != null) sb.append(f138!!); else sb.append("null")
        sb.append(",f139="); if (f139 != null) sb.append(f139!!); else sb.append("null")
        sb.append(",f140="); if (f140 != null) sb.append(f140!!); else sb.append("null")
        sb.append(",f141="); if (f141 != null) sb.append(f141!!); else sb.append("null")
        sb.append(",f142="); if (f142 != null) sb.append(f142!!); else sb.append("null")
        sb.append(",f143="); if (f143 != null) sb.append(f143!!); else sb.append("null")
        sb.append(",f144="); if (f144 != null) sb.append(f144!!); else sb.append("null")
        sb.append(",f145="); if (f145 != null) sb.append("\"").append(f145!!).append("\""); else sb.append("null")
        sb.append(",f146="); if (f146 != null) sb.append("\"").append(f146!!).append("\""); else sb.append("null")
        sb.append(",f147="); if (f147 != null) sb.append("\"").append(f147!!).append("\""); else sb.append("null")
        sb.append(",f148="); if (f148 != null) sb.append(f148!!.epochSecond * 1000000000 + f148!!.nano); else sb.append("null")
        sb.append(",f149="); if (f149 != null) sb.append(f149!!.epochSecond * 1000000000 + f149!!.nano); else sb.append("null")
        sb.append(",f150="); if (f150 != null) sb.append(f150!!.epochSecond * 1000000000 + f150!!.nano); else sb.append("null")
        sb.append(",f151="); if (f151 != null) sb.append("\"").append(f151!!).append("\""); else sb.append("null")
        sb.append(",f152="); if (f152 != null) sb.append("\"").append(f152!!).append("\""); else sb.append("null")
        sb.append(",f153="); if (f153 != null) sb.append("\"").append(f153!!).append("\""); else sb.append("null")
        sb.append(",f154="); if (f154 != null) sb.append(f154!!); else sb.append("null")
        sb.append(",f155="); if (f155 != null) sb.append(f155!!); else sb.append("null")
        sb.append(",f156="); if (f156 != null) sb.append(f156!!); else sb.append("null")
        sb.append(",f157="); if (f157 != null) sb.append(f157!!); else sb.append("null")
        sb.append(",f158="); if (f158 != null) sb.append(f158!!); else sb.append("null")
        sb.append(",f159="); if (f159 != null) sb.append(f159!!); else sb.append("null")
        sb.append(",f160="); if (f160 != null) sb.append(f160!!); else sb.append("null")
        sb.append(",f161="); if (f161 != null) sb.append(f161!!); else sb.append("null")
        sb.append(",f162="); if (f162 != null) sb.append(f162!!); else sb.append("null")
        sb.append(",f163="); if (f163 != null) sb.append(f163!!); else sb.append("null")
        sb.append(",f164="); if (f164 != null) sb.append(f164!!); else sb.append("null")
        sb.append(",f165="); if (f165 != null) sb.append(f165!!); else sb.append("null")
        sb.append(")")
        return sb.toString()
    }

    override fun toJson(): String = com.chronoxor.test.fbe.Json.engine.toJson(this)

    companion object
    {
        fun fromJson(json: String): StructOptional = com.chronoxor.test.fbe.Json.engine.fromJson(json, StructOptional::class.java)
    }
}
