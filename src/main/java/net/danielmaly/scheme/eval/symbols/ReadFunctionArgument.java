package net.danielmaly.scheme.eval.symbols;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.types.ConsCell;

import java.util.Iterator;
import java.util.List;

public class ReadFunctionArgument extends SchemeExpression {

    public final int argumentIndex;

    public ReadFunctionArgument(int argumentIndex) {
        this.argumentIndex = argumentIndex;
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        if (!this.isArgumentIndexInRange(virtualFrame, this.argumentIndex)) {
            CompilerDirectives.transferToInterpreterAndInvalidate();
            throw new RuntimeException("Not enough arguments passed. Missing " + (this.argumentIndex + 1) + "th argument");
        }
        return this.getArgument(virtualFrame, this.argumentIndex);
    }

    @Override
    public String toString() {
        return "(arg " + this.argumentIndex + ")";
    }
}
