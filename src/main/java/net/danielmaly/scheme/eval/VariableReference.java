package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.NodeFields;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;

@NodeFields({
    @NodeField(name = "slot", type = FrameSlot.class), @NodeField(name = "depth", type = Integer.class)
})
public abstract class VariableReference extends SchemeExpression {

    public abstract FrameSlot getSlot();
    public abstract Integer getDepth();

    public interface FrameGet<T> {
        T get(Frame frame, FrameSlot slot) throws FrameSlotTypeException;
    }

    public <T> T readUpStack(FrameGet<T> getter, Frame frame) throws FrameSlotTypeException {
        for(int i = 0; i < getDepth(); i++) {
            frame = getLexicalScope(frame);
        }

        T value = getter.get(frame, this.getSlot());
        if(value == null) {
            throw new RuntimeException("Unknown variable: " + this.getSlot().getIdentifier());
        }
        return value;
    }

    @Specialization(rewriteOn = FrameSlotTypeException.class)
    protected long readLong(VirtualFrame virtualFrame) throws FrameSlotTypeException {
        return this.readUpStack(Frame::getLong, virtualFrame);
    }

    @Specialization(rewriteOn = FrameSlotTypeException.class)
    protected double readDouble(VirtualFrame virtualFrame) throws FrameSlotTypeException {
        return this.readUpStack(Frame::getDouble, virtualFrame);
    }

    @Specialization(rewriteOn = FrameSlotTypeException.class)
    protected boolean readBoolean(VirtualFrame virtualFrame) throws FrameSlotTypeException {
        return this.readUpStack(Frame::getBoolean, virtualFrame);
    }

    @Specialization(rewriteOn = FrameSlotTypeException.class)
    protected Object readObject(VirtualFrame virtualFrame) throws FrameSlotTypeException {
        return this.readUpStack(Frame::getObject, virtualFrame);
    }

    @Specialization(contains = {"readLong", "readDouble", "readBoolean", "readObject"})
    protected Object read(VirtualFrame virtualFrame) {
        try {
            return this.readUpStack(Frame::getValue, virtualFrame);
        } catch (FrameSlotTypeException e) {
            // FrameSlotTypeException not thrown
        }
        return null;
    }

    @Override
    public String toString() {
        return "[" + getSlot().getIdentifier().toString() + "]";
    }
}
