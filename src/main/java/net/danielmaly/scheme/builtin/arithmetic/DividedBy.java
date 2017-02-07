package net.danielmaly.scheme.builtin.arithmetic;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "/")
@GenerateNodeFactory
public abstract class DividedBy extends BuiltinExpression {
    @Specialization
    public long dividedBy(long a, long b) {
        return a / b;
    }

    @Specialization
    public double dividedBy(double a, double b) {
        return a / b;
    }

}
