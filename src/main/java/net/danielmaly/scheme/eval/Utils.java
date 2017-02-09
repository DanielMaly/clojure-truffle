package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.DirectCallNode;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import net.danielmaly.scheme.types.NilValue;
import net.danielmaly.scheme.types.SchemeFunction;

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

    public static Object callFunction(VirtualFrame frame, SchemeFunction function, Object... args) {
        Object[] argumentValues = new Object[args.length + 1];
        argumentValues[0] = function.getLexicalScope();
        for (int i = 0; i < args.length; i++) {
            argumentValues[i+1] = args[i];
        }

        DirectCallNode callNode = Truffle.getRuntime().createDirectCallNode(function.callTarget);
        return callNode.call(frame, argumentValues);
    }
}
