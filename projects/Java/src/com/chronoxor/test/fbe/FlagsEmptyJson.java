// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

package com.chronoxor.test.fbe;;

public final class FlagsEmptyJson implements com.google.gson.JsonSerializer<com.chronoxor.test.FlagsEmpty>, com.google.gson.JsonDeserializer<com.chronoxor.test.FlagsEmpty>
{

    @Override
    public com.google.gson.JsonElement serialize(com.chronoxor.test.FlagsEmpty src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive(src.getRaw());
    }

    @Override
    public com.chronoxor.test.FlagsEmpty deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return new com.chronoxor.test.FlagsEmpty(json.getAsJsonPrimitive().getAsInt());
    }
}
