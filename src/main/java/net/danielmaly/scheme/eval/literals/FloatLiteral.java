package net.danielmaly.scheme.eval.literals;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import net.danielmaly.scheme.eval.SchemeExpression;

public class FloatLiteral extends SchemeExpression {
    private double value;

    public FloatLiteral(double value) {
        this.value = value;
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return value;
    }

    @Override
    public double executeDouble(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
