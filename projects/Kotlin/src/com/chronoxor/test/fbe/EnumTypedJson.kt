// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

class EnumTypedJson : com.google.gson.JsonSerializer<com.chronoxor.test.EnumTyped>, com.google.gson.JsonDeserializer<com.chronoxor.test.EnumTyped>
{
    override fun serialize(src: com.chronoxor.test.EnumTyped, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): com.chronoxor.test.EnumTyped
    {
        return com.chronoxor.test.EnumTyped(json.asJsonPrimitive.asByte)
    }
}
