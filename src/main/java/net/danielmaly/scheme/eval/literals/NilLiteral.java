package net.danielmaly.scheme.eval.literals;

import com.oracle.truffle.api.frame.VirtualFrame;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.types.NilValue;

public class NilLiteral extends SchemeExpression {
    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return NilValue.NIL;
    }
}
