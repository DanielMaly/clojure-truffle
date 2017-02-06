package net.danielmaly.scheme.eval.literals;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import net.danielmaly.scheme.eval.SchemeExpression;

public class IntegerLiteral extends SchemeExpression {
    private long value;

    public IntegerLiteral(long value) {
        this.value = value;
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return value;
    }

    @Override
    public long executeLong(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return value;
    }
}
