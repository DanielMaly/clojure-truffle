package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.eval.Utils;

@NodeInfo(shortName = "string?")
@GenerateNodeFactory
public abstract class IsString extends BuiltinExpression {

    @Specialization
    public boolean isString(Object a) {
        return a instanceof String;
    }
}
