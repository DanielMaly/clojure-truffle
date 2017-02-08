package net.danielmaly.scheme.eval.logical;

import com.oracle.truffle.api.frame.VirtualFrame;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.eval.Utils;

public class And extends SchemeExpression {

    @Child private SchemeExpression left;
    @Child private SchemeExpression right;

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return executeBoolean(virtualFrame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame virtualFrame) {
        return Utils.testResult(left, virtualFrame) && Utils.testResult(right, virtualFrame);
    }
}
