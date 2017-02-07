package net.danielmaly.scheme.builtin.io;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.NilValue;

@NodeInfo(shortName = "newline")
public abstract class Newline extends BuiltinExpression {

    @Specialization
    public Object newline() {
        System.out.println();
        return NilValue.NIL;
    }
}
