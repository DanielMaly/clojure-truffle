package net.danielmaly.scheme.builtin.list;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.ConsCell;

@NodeInfo(shortName = "car")
@GenerateNodeFactory
public abstract class Car extends BuiltinExpression {

    @Specialization
    public Object car(ConsCell consCell) {
        return consCell.getCar();
    }
}
