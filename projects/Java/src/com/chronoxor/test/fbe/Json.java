// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

package com.chronoxor.test.fbe;

// Fast Binary Encoding test JSON engine
public final class Json
{
    private static final com.google.gson.Gson _engine;

    // Get the JSON engine
    public static com.google.gson.Gson getEngine() { return _engine; }

    static
    {
        _engine = register(new com.google.gson.GsonBuilder()).create();
    }

    private Json() {}

    public static com.google.gson.GsonBuilder register(com.google.gson.GsonBuilder builder)
    {
        com.chronoxor.fbe.Json.register(builder);
        com.chronoxor.proto.fbe.Json.register(builder);
        builder.registerTypeAdapter(com.chronoxor.test.EnumSimple.class, new EnumSimpleJson());
        builder.registerTypeAdapter(com.chronoxor.test.EnumTyped.class, new EnumTypedJson());
        builder.registerTypeAdapter(com.chronoxor.test.EnumEmpty.class, new EnumEmptyJson());
        builder.registerTypeAdapter(com.chronoxor.test.FlagsSimple.class, new FlagsSimpleJson());
        builder.registerTypeAdapter(com.chronoxor.test.FlagsTyped.class, new FlagsTypedJson());
        builder.registerTypeAdapter(com.chronoxor.test.FlagsEmpty.class, new FlagsEmptyJson());
        return builder;
    }
}
