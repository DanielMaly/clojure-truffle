package net.danielmaly.scheme.builtin.arithmetic;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "*")
public abstract class Times extends BuiltinExpression {

    @Specialization
    public long times(long a, long b) {
        return a * b;
    }

    @Specialization
    public double times(double a, double b) {
        return a * b;
    }

}
