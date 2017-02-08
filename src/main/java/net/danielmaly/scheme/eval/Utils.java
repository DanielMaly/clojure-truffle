package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import net.danielmaly.scheme.types.NilValue;

public class Utils {
    public static boolean testResult(SchemeExpression test, VirtualFrame virtualFrame) {
        try {
            return test.executeBoolean(virtualFrame);
        } catch (UnexpectedResultException e) {
            Object result = test.execute(virtualFrame);
            return result != NilValue.NIL;
        }
    }

    public static boolean toBoolean(Object a) {
        if(a.equals(true) || a.equals(false)) {
            return (boolean) a;
        }
        else {
            return !a.equals(NilValue.NIL);
        }
    }
}
