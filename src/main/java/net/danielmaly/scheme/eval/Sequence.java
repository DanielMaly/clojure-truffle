package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import net.danielmaly.scheme.types.NilValue;

public class Sequence extends SchemeExpression {
    @Children private final SchemeExpression[] expressions;

    public Sequence(SchemeExpression[] expressions) {
        this.expressions = expressions;
    }


    @Override
    @ExplodeLoop
    public Object execute(VirtualFrame virtualFrame) {
        int secondToLast = this.expressions.length - 1;
        CompilerAsserts.compilationConstant(secondToLast);
        Object value = null;
        for (SchemeExpression expression : this.expressions) {
            Object newvalue = expression.execute(virtualFrame);
            if (value == null || value.equals(NilValue.NIL) || !newvalue.equals(NilValue.NIL)) {
                value = newvalue;
            }
        }
        return value;
    }

    public SchemeExpression[] getExpressions() {
        return expressions;
    }
}
