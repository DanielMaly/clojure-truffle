package net.danielmaly.scheme.builtin.predicates;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "eq?")
@GenerateNodeFactory
public abstract class Eq extends BuiltinExpression {

    @Specialization
    public boolean eq(Object a, Object b) {
        return a == b;
    }

}
