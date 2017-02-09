package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "eqv?")
@GenerateNodeFactory
public abstract class Eqv extends BuiltinExpression {

    @Specialization
    public boolean eqv(long a, long b) {
        return a == b;
    }

    @Specialization
    public boolean eqv(double a, double b) {
        return a == b;
    }

    @Specialization
    public boolean eqv(boolean a, boolean b) {
        return a == b;
    }

    @Specialization
    public boolean eqv(Object a, Object b) {
        return a == b;
    }
}
