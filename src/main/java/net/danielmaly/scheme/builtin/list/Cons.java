package net.danielmaly.scheme.builtin.list;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.ConsCell;

@NodeInfo(shortName = "cons")
@GenerateNodeFactory
public abstract class Cons extends BuiltinExpression {

    @Specialization
    public Object cons(Object car, Object cdr) {
        return new ConsCell(car, cdr);
    }
}
