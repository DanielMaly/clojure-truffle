package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "equal?")
@GenerateNodeFactory
public abstract class Equal extends BuiltinExpression {

    @Specialization
    public boolean equal(long a, long b) {
        return a == b;
    }

    @Specialization
    public boolean equal(double a, double b) {
        return a == b;
    }

    @Specialization
    public boolean equal(boolean a, boolean b) {
        return a == b;
    }

    @Specialization
    public boolean equal(Object a, Object b) {
        return a.equals(b);
    }
}
