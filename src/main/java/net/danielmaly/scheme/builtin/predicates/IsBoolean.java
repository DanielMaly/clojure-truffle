package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.eval.Utils;

@NodeInfo(shortName = "boolean?")
@GenerateNodeFactory
public abstract class IsBoolean extends BuiltinExpression {

    @Specialization
    public boolean isBoolean(Object a) {
        return a instanceof Boolean;
    }
}
