package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.eval.Utils;
import net.danielmaly.scheme.types.NilValue;

@NodeInfo(shortName = "null?")
@GenerateNodeFactory
public abstract class IsNull extends BuiltinExpression {

    @Specialization
    public boolean isNull(Object a) {
        return a.equals(NilValue.NIL);
    }
}
