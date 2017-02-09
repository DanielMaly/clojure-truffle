package net.danielmaly.scheme.builtin.list;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.ConsCell;
import net.danielmaly.scheme.types.NilValue;

@NodeInfo(shortName = "length")
@GenerateNodeFactory
public abstract class Length extends BuiltinExpression {

    @Specialization
    public Object length(ConsCell list) {
        if(list.getCar().equals(NilValue.NIL)) {
            return 0;
        }
        int length = 1;
        while((list.getCdr()) instanceof ConsCell) {
            list = (ConsCell) list.getCdr();
            length += 1;
        }
        return length;
    }
}
