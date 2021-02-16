// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

internal class BytesJson : com.google.gson.JsonSerializer<ByteArray>, com.google.gson.JsonDeserializer<ByteArray>
{
    override fun serialize(src: ByteArray, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(java.util.Base64.getEncoder().encodeToString(src))
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): ByteArray
    {
        return java.util.Base64.getDecoder().decode(json.asString)
    }
}

internal class CharacterJson : com.google.gson.JsonSerializer<Char>, com.google.gson.JsonDeserializer<Char>
{
    override fun serialize(src: Char, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.toLong())
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): Char
    {
        return json.asLong.toChar()
    }
}

internal class InstantJson : com.google.gson.JsonSerializer<java.time.Instant>, com.google.gson.JsonDeserializer<java.time.Instant>
{
    override fun serialize(src: java.time.Instant, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        val nanoseconds = src.epochSecond * 1000000000 + src.nano
        return com.google.gson.JsonPrimitive(nanoseconds)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): java.time.Instant
    {
        val nanoseconds = json.asJsonPrimitive.asLong
        return java.time.Instant.ofEpochSecond(nanoseconds / 1000000000, nanoseconds % 1000000000)
    }
}

internal class BigDecimalJson : com.google.gson.JsonSerializer<java.math.BigDecimal>, com.google.gson.JsonDeserializer<java.math.BigDecimal>
{
    override fun serialize(src: java.math.BigDecimal, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.toPlainString())
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): java.math.BigDecimal
    {
        return java.math.BigDecimal(json.asJsonPrimitive.asString)
    }
}

internal class UUIDJson : com.google.gson.JsonSerializer<java.util.UUID>, com.google.gson.JsonDeserializer<java.util.UUID>
{
    override fun serialize(src: java.util.UUID, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.toString())
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): java.util.UUID {
        return java.util.UUID.fromString(json.asJsonPrimitive.asString)
    }
}

internal class UByteNullableJson : com.google.gson.JsonSerializer<UByte?>, com.google.gson.JsonDeserializer<UByte?>
{
    override fun serialize(src: UByte?, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        if (src == null)
            return com.google.gson.JsonNull.INSTANCE

        return com.google.gson.JsonPrimitive(src.toLong())
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): UByte?
    {
        if (json.isJsonNull)
            return null

        return json.asLong.toUByte()
    }
}

internal class UShortNullableJson : com.google.gson.JsonSerializer<UShort?>, com.google.gson.JsonDeserializer<UShort?>
{
    override fun serialize(src: UShort?, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        if (src == null)
            return com.google.gson.JsonNull.INSTANCE

        return com.google.gson.JsonPrimitive(src.toLong())
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): UShort?
    {
        if (json.isJsonNull)
            return null

        return json.asLong.toUShort()
    }
}

internal class UIntNullableJson : com.google.gson.JsonSerializer<UInt?>, com.google.gson.JsonDeserializer<UInt?>
{
    override fun serialize(src: UInt?, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        if (src == null)
            return com.google.gson.JsonNull.INSTANCE

        return com.google.gson.JsonPrimitive(src.toLong())
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): UInt?
    {
        if (json.isJsonNull)
            return null

        return json.asLong.toUInt()
    }
}

internal class ULongNullableJson : com.google.gson.JsonSerializer<ULong?>, com.google.gson.JsonDeserializer<ULong?>
{
    override fun serialize(src: ULong?, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        if (src == null)
            return com.google.gson.JsonNull.INSTANCE

        return com.google.gson.JsonPrimitive(src.toLong())
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): ULong?
    {
        if (json.isJsonNull)
            return null

        return json.asLong.toULong()
    }
}

// Fast Binary Encoding base JSON engine
@Suppress("MemberVisibilityCanBePrivate")
object Json
{
    // Get the JSON engine
    val engine: com.google.gson.Gson = register(com.google.gson.GsonBuilder()).create()

    fun register(builder: com.google.gson.GsonBuilder): com.google.gson.GsonBuilder
    {
        builder.serializeNulls()
        builder.registerTypeAdapter(ByteArray::class.java, BytesJson())
        builder.registerTypeAdapter(Char::class.java, CharacterJson())
        builder.registerTypeAdapter(Character::class.java, CharacterJson())
        builder.registerTypeAdapter(java.time.Instant::class.java, InstantJson())
        builder.registerTypeAdapter(java.math.BigDecimal::class.java, BigDecimalJson())
        builder.registerTypeAdapter(java.util.UUID::class.java, UUIDJson())
        builder.registerTypeAdapter(kotlin.UByte::class.java, UByteNullableJson())
        builder.registerTypeAdapter(kotlin.UShort::class.java, UShortNullableJson())
        builder.registerTypeAdapter(kotlin.UInt::class.java, UIntNullableJson())
        builder.registerTypeAdapter(kotlin.ULong::class.java, ULongNullableJson())
        return builder
    }
}
