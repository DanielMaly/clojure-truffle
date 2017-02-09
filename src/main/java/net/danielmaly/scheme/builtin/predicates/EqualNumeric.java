package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "=")
@GenerateNodeFactory
public abstract class EqualNumeric extends BuiltinExpression {

    @Specialization
    public boolean equalNumeric(long a, long b) {
        return a == b;
    }

    @Specialization
    public boolean equalNumeric(double a, double b) {
        return a == b;
    }
}
