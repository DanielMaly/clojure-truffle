package net.danielmaly.scheme.eval.symbols;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;

public abstract class LocalVariable extends Variable {
    @Specialization(rewriteOn = FrameSlotTypeException.class)
    protected long readLong(VirtualFrame virtualFrame)
            throws FrameSlotTypeException{
        return virtualFrame.getLong(getSlot());
    }

    @Specialization(rewriteOn = FrameSlotTypeException.class)
    protected double readDouble(VirtualFrame virtualFrame)
            throws FrameSlotTypeException{
        return virtualFrame.getDouble(getSlot());
    }

    @Specialization(rewriteOn = FrameSlotTypeException.class)
    protected boolean readBoolean(VirtualFrame virtualFrame)
            throws FrameSlotTypeException{
        return virtualFrame.getBoolean(getSlot());
    }

    @Specialization(rewriteOn = FrameSlotTypeException.class)
    protected Object readObject(VirtualFrame virtualFrame)
            throws FrameSlotTypeException{
        return virtualFrame.getObject(getSlot());
    }

    @Specialization(contains = { "readLong", "readDouble", "readBoolean", "readObject" })
    protected Object read(VirtualFrame virtualFrame) {
        return virtualFrame.getValue(getSlot());
    }
}
