package net.danielmaly.scheme.builtin.arithmetic;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "-")
@GenerateNodeFactory
public abstract class Minus extends BuiltinExpression {
    @Specialization
    public long minus(long a, long b) {
        return a - b;
    }

    @Specialization
    public double minus(double a, double b) {
        return a - b;
    }

}

