package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.eval.Utils;

@NodeInfo(shortName = "not")
@GenerateNodeFactory
public abstract class Not extends BuiltinExpression {

    @Specialization
    public boolean not(boolean a) {
        return !a;
    }

    @Specialization
    public boolean not(Object a) {
        return !Utils.toBoolean(a);
    }
}
