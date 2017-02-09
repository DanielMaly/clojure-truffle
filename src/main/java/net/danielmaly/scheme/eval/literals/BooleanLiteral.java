package net.danielmaly.scheme.eval.literals;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import net.danielmaly.scheme.eval.SchemeExpression;

public class BooleanLiteral extends SchemeExpression {

    private Boolean value;

    public BooleanLiteral(Boolean value) {
        this.value = value;
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return value;
    }

    @Override
    public boolean executeBoolean(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return value;
    }
}
