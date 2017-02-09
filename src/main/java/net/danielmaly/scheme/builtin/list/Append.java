package net.danielmaly.scheme.builtin.list;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.ConsCell;
import net.danielmaly.scheme.types.NilValue;

@NodeInfo(shortName = "append")
@GenerateNodeFactory
public abstract class Append extends BuiltinExpression {

    @Specialization
    public Object append(ConsCell list1, ConsCell list2) {
        while(list1.getCdr() instanceof ConsCell) {
            list1 = (ConsCell) list1.getCdr();
        }
        if(!list1.getCdr().equals(NilValue.NIL)) {
            throw new RuntimeException("The first argument to append is not a well-formed list");
        }
        list1.setCdr(list2);
        return list1;
    }
}
