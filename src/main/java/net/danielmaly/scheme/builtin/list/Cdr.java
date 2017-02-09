package net.danielmaly.scheme.builtin.list;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.ConsCell;

@NodeInfo(shortName = "cdr")
@GenerateNodeFactory
public abstract class Cdr extends BuiltinExpression {

    @Specialization
    public Object cdr(ConsCell consCell) {
        return consCell.getCdr();
    }
}
