package net.danielmaly.scheme.builtin.ordering;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = ">=")
@GenerateNodeFactory
public abstract class GreaterThanEqual extends BuiltinExpression {

    @Specialization
    public boolean greaterThanEqual(long a, long b) {
        return a >= b;
    }

    @Specialization
    public boolean greaterThanEqual(double a, double b) {
        return a >= b;
    }
}
