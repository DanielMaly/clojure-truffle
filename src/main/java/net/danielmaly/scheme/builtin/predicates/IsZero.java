package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.eval.Utils;

@NodeInfo(shortName = "zero?")
@GenerateNodeFactory
public abstract class IsZero extends BuiltinExpression {

    @Specialization
    public boolean isZero(Number a) {
        return a.doubleValue() == 0;
    }
}
