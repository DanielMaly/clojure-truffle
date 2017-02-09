package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.eval.Utils;

@NodeInfo(shortName = "number?")
@GenerateNodeFactory
public abstract class IsNumber extends BuiltinExpression {

    @Specialization
    public boolean isNumber(Object a) {
        return a instanceof Number;
    }
}
