package net.danielmaly.scheme.builtin.ordering;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "<")
@GenerateNodeFactory
public abstract class LessThan extends BuiltinExpression {

    @Specialization
    public boolean lessThan(long a, long b) {
        return a < b;
    }

    @Specialization
    public boolean lessThan(double a, double b) {
        return a < b;
    }
}
