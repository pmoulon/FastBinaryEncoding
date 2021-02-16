// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.6.0.0

package com.chronoxor.test.fbe;

// Fast Binary Encoding Bytes vector field model
public final class FieldModelVectorBytes extends com.chronoxor.fbe.FieldModel
{
    private final com.chronoxor.fbe.FieldModelBytes _model;

    public FieldModelVectorBytes(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        _model = new com.chronoxor.fbe.FieldModelBytes(buffer, offset);
    }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }
    // Get the field extra size
    @Override
    public long fbeExtra()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeVectorOffset = readInt32(fbeOffset());
        if ((fbeVectorOffset == 0) || ((_buffer.getOffset() + fbeVectorOffset + 4) > _buffer.getSize()))
            return 0;

        int fbeVectorSize = readInt32(fbeVectorOffset);

        long fbeResult = 4;
        _model.fbeOffset(fbeVectorOffset + 4);
        for (int i = fbeVectorSize; i-- > 0;)
        {
            fbeResult += _model.fbeSize() + _model.fbeExtra();
            _model.fbeShift(_model.fbeSize());
        }
        return fbeResult;
    }

    // Get the vector offset
    public long getOffset()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeVectorOffset = readInt32(fbeOffset());
        return fbeVectorOffset;
    }

    // Get the vector size
    public long getSize()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeVectorOffset = readInt32(fbeOffset());
        if ((fbeVectorOffset == 0) || ((_buffer.getOffset() + fbeVectorOffset + 4) > _buffer.getSize()))
            return 0;

        int fbeVectorSize = readInt32(fbeVectorOffset);
        return fbeVectorSize;
    }

    // Vector index operator
    public com.chronoxor.fbe.FieldModelBytes getItem(long index)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";

        int fbeVectorOffset = readInt32(fbeOffset());
        assert ((fbeVectorOffset > 0) && ((_buffer.getOffset() + fbeVectorOffset + 4) <= _buffer.getSize())) : "Model is broken!";

        int fbeVectorSize = readInt32(fbeVectorOffset);
        assert (index < fbeVectorSize) : "Index is out of bounds!";

        _model.fbeOffset(fbeVectorOffset + 4);
        _model.fbeShift(index * _model.fbeSize());
        return _model;
    }

    // Resize the vector and get its first model
    public com.chronoxor.fbe.FieldModelBytes resize(long size)
    {
        int fbeVectorSize = (int)(size * _model.fbeSize());
        int fbeVectorOffset = (int)(_buffer.allocate(4 + fbeVectorSize) - _buffer.getOffset());
        assert ((fbeVectorOffset > 0) && ((_buffer.getOffset() + fbeVectorOffset + 4) <= _buffer.getSize())) : "Model is broken!";

        write(fbeOffset(), fbeVectorOffset);
        write(fbeVectorOffset, (int)size);
        write(fbeVectorOffset + 4, (byte)0, fbeVectorSize);

        _model.fbeOffset(fbeVectorOffset + 4);
        return _model;
    }

    // Check if the vector is valid
    @Override
    public boolean verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return true;

        int fbeVectorOffset = readInt32(fbeOffset());
        if (fbeVectorOffset == 0)
            return true;

        if ((_buffer.getOffset() + fbeVectorOffset + 4) > _buffer.getSize())
            return false;

        int fbeVectorSize = readInt32(fbeVectorOffset);

        _model.fbeOffset(fbeVectorOffset + 4);
        for (int i = fbeVectorSize; i-- > 0;)
        {
            if (!_model.verify())
                return false;
            _model.fbeShift(_model.fbeSize());
        }

        return true;
    }

    // Get the vector as java.util.ArrayList
    public void get(java.util.ArrayList<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        long fbeVectorSize = getSize();
        if (fbeVectorSize == 0)
            return;

        values.ensureCapacity((int)fbeVectorSize);

        var fbeModel = getItem(0);
        for (long i = fbeVectorSize; i-- > 0;)
        {
            java.nio.ByteBuffer value = fbeModel.get();
            values.add(value);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Get the vector as java.util.LinkedList
    public void get(java.util.LinkedList<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        long fbeVectorSize = getSize();
        if (fbeVectorSize == 0)
            return;

        var fbeModel = getItem(0);
        for (long i = fbeVectorSize; i-- > 0;)
        {
            java.nio.ByteBuffer value = fbeModel.get();
            values.add(value);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Get the vector as java.util.HashSet
    public void get(java.util.HashSet<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        long fbeVectorSize = getSize();
        if (fbeVectorSize == 0)
            return;

        var fbeModel = getItem(0);
        for (long i = fbeVectorSize; i-- > 0;)
        {
            java.nio.ByteBuffer value = fbeModel.get();
            values.add(value);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Set the vector as java.util.ArrayList
    public void set(java.util.ArrayList<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        var fbeModel = resize(values.size());
        for (var value : values)
        {
            fbeModel.set(value);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Set the vector as java.util.LinkedList
    public void set(java.util.LinkedList<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        var fbeModel = resize(values.size());
        for (var value : values)
        {
            fbeModel.set(value);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Set the vector as java.util.HashSet
    public void set(java.util.HashSet<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        var fbeModel = resize(values.size());
        for (var value : values)
        {
            fbeModel.set(value);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }
}
