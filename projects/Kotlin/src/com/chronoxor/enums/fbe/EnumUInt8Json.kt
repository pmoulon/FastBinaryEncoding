// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

class EnumUInt8Json : com.google.gson.JsonSerializer<com.chronoxor.enums.EnumUInt8>, com.google.gson.JsonDeserializer<com.chronoxor.enums.EnumUInt8>
{
    override fun serialize(src: com.chronoxor.enums.EnumUInt8, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw.toByte())
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): com.chronoxor.enums.EnumUInt8
    {
        return com.chronoxor.enums.EnumUInt8(json.asJsonPrimitive.asByte.toUByte())
    }
}
