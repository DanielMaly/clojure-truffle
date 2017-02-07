package net.danielmaly.scheme.builtin.ordering;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "<=")
@GenerateNodeFactory
public abstract class LessThanEqual extends BuiltinExpression {

    @Specialization
    public boolean lessThanEqual(long a, long b) {
        return a <= b;
    }

    @Specialization
    public boolean lessThanEqual(double a, double b) {
        return a <= b;
    }
}
