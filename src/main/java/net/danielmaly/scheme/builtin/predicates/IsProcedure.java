package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.eval.Utils;
import net.danielmaly.scheme.types.SchemeFunction;

@NodeInfo(shortName = "procedure?")
@GenerateNodeFactory
public abstract class IsProcedure extends BuiltinExpression {

    @Specialization
    public boolean isProcedure(Object a) {
        return a instanceof SchemeFunction;
    }
}
