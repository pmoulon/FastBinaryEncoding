// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

package com.chronoxor.test;

public final class FlagsSimple implements Comparable<FlagsSimple>
{
    public static final FlagsSimple FLAG_VALUE_0 = new FlagsSimple(FlagsSimpleEnum.FLAG_VALUE_0);
    public static final FlagsSimple FLAG_VALUE_1 = new FlagsSimple(FlagsSimpleEnum.FLAG_VALUE_1);
    public static final FlagsSimple FLAG_VALUE_2 = new FlagsSimple(FlagsSimpleEnum.FLAG_VALUE_2);
    public static final FlagsSimple FLAG_VALUE_3 = new FlagsSimple(FlagsSimpleEnum.FLAG_VALUE_3);
    public static final FlagsSimple FLAG_VALUE_4 = new FlagsSimple(FlagsSimpleEnum.FLAG_VALUE_4);
    public static final FlagsSimple FLAG_VALUE_5 = new FlagsSimple(FlagsSimpleEnum.FLAG_VALUE_5);

    private FlagsSimpleEnum value = FlagsSimpleEnum.values()[0];
    private int flags = value.getRaw();

    public FlagsSimple() {}
    public FlagsSimple(int value) { setEnum(value); }
    public FlagsSimple(FlagsSimpleEnum value) { setEnum(value); }
    public FlagsSimple(java.util.EnumSet<FlagsSimpleEnum> value) { setEnum(value); }
    public FlagsSimple(FlagsSimple value) { setEnum(value); }

    public FlagsSimpleEnum getEnum() { return value; }
    public int getRaw() { return flags; }

    public void setDefault() { setEnum((int)0); }

    public void setEnum(int value) { this.flags = value; this.value = FlagsSimpleEnum.mapValue(value); }
    public void setEnum(FlagsSimpleEnum value) { this.value = value; this.flags = value.getRaw(); }
    public void setEnum(java.util.EnumSet<FlagsSimpleEnum> value) { setEnum(FlagsSimple.fromSet(value)); }
    public void setEnum(FlagsSimple value) { this.value = value.value; this.flags = value.flags; }

    public boolean hasFlags(int flags) { return (((this.flags & flags) != 0) && ((this.flags & flags) == flags)); }
    public boolean hasFlags(FlagsSimpleEnum flags) { return hasFlags(flags.getRaw()); }
    public boolean hasFlags(FlagsSimple flags) { return hasFlags(flags.flags); }

    public FlagsSimple setFlags(int flags) { setEnum((int)(this.flags | flags)); return this; }
    public FlagsSimple setFlags(FlagsSimpleEnum flags) { setFlags(flags.getRaw()); return this; }
    public FlagsSimple setFlags(FlagsSimple flags) { setFlags(flags.flags); return this; }

    public FlagsSimple removeFlags(int flags) { setEnum((int)(this.flags & ~flags)); return this; }
    public FlagsSimple removeFlags(FlagsSimpleEnum flags) { removeFlags(flags.getRaw()); return this; }
    public FlagsSimple removeFlags(FlagsSimple flags) { removeFlags(flags.flags); return this; }

    public java.util.EnumSet<FlagsSimpleEnum> getAllSet() { return value.getAllSet(); }
    public java.util.EnumSet<FlagsSimpleEnum> getNoneSet() { return value.getNoneSet(); }
    public java.util.EnumSet<FlagsSimpleEnum> getCurrentSet() { return value.getCurrentSet(); }

    public static FlagsSimple fromSet(java.util.EnumSet<FlagsSimpleEnum> set)
    {
        int result = 0;
        if (set.contains(FLAG_VALUE_0.getEnum()))
        {
            result |= FLAG_VALUE_0.flags;
        }
        if (set.contains(FLAG_VALUE_1.getEnum()))
        {
            result |= FLAG_VALUE_1.flags;
        }
        if (set.contains(FLAG_VALUE_2.getEnum()))
        {
            result |= FLAG_VALUE_2.flags;
        }
        if (set.contains(FLAG_VALUE_3.getEnum()))
        {
            result |= FLAG_VALUE_3.flags;
        }
        if (set.contains(FLAG_VALUE_4.getEnum()))
        {
            result |= FLAG_VALUE_4.flags;
        }
        if (set.contains(FLAG_VALUE_5.getEnum()))
        {
            result |= FLAG_VALUE_5.flags;
        }
        return new FlagsSimple(result);
    }

    @Override
    public int compareTo(FlagsSimple other)
    {
        return (int)(flags - other.flags);
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!FlagsSimple.class.isAssignableFrom(other.getClass()))
            return false;

        final FlagsSimple flg = (FlagsSimple)other;

        if (flags != flg.flags)
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + (int)flags;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        boolean first = true;
        if (hasFlags(FLAG_VALUE_0.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_0");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_1.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_1");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_2.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_2");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_3.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_3");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_4.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_4");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_5.flags))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_5");
            first = false;
        }
        return sb.toString();
    }
}
