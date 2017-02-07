package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

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
        for (int i=0; i<secondToLast; i++) {
            this.expressions[i].execute(virtualFrame);
        }
        return this.expressions[secondToLast].execute(virtualFrame);
    }

    public SchemeExpression[] getExpressions() {
        return expressions;
    }
}
