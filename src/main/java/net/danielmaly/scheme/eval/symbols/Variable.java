package net.danielmaly.scheme.eval.symbols;

import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.frame.FrameSlot;
import net.danielmaly.scheme.eval.SchemeExpression;

@NodeField(name = "slot", type = FrameSlot.class)
public abstract class Variable extends SchemeExpression {

    public abstract FrameSlot getSlot();

    @Override
    public String toString() {
        return "'" + this.getSlot().getIdentifier();
    }
}