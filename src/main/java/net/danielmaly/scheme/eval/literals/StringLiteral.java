package net.danielmaly.scheme.eval.literals;

import com.oracle.truffle.api.frame.VirtualFrame;
import net.danielmaly.scheme.eval.SchemeExpression;

public class StringLiteral extends SchemeExpression {
    private String value;

    public StringLiteral(String value) {
        this.value = value;
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return value;
    }

    @Override
    public String executeString(VirtualFrame virtualFrame) {
        return value;
    }
}
