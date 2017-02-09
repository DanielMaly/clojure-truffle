package net.danielmaly.scheme.eval.logical;

import com.oracle.truffle.api.frame.VirtualFrame;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.eval.Utils;

public class Or extends SchemeExpression {

    @Children private final SchemeExpression[] tests;

    public Or(SchemeExpression[] tests) {
        this.tests = tests;
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return executeBoolean(virtualFrame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame virtualFrame) {
        for(SchemeExpression test : tests) {
            if(Utils.testResult(test, virtualFrame)) {
                return true;
            }
        }
        return false;
    }
}
