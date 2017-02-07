package net.danielmaly.scheme.builtin.arithmetic;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "+")
public abstract class Plus extends BuiltinExpression {
    @Specialization
    public long plus(long a, long b) {
        return a + b;
    }

    @Specialization
    public double plus(double a, double b) {
        return a + b;
    }

}
