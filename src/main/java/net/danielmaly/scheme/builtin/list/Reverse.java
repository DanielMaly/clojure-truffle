package net.danielmaly.scheme.builtin.list;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.ConsCell;
import net.danielmaly.scheme.types.NilValue;

import java.util.Stack;

@NodeInfo(shortName = "reverse")
@GenerateNodeFactory
public abstract class Reverse extends BuiltinExpression {

    @Specialization
    public Object reverse(ConsCell list1) {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push(list1.getCar());
        while(list1.getCdr() instanceof ConsCell) {
            list1 = (ConsCell) list1.getCdr();
            objectStack.push(list1.getCar());
        }
        if(!list1.getCdr().equals(NilValue.NIL)) {
            throw new RuntimeException("The first argument to append is not a well-formed list");
        }
        ConsCell newList = new ConsCell();
        ConsCell original = newList;
        while(!objectStack.empty())  {
            newList.setCar(objectStack.pop());
            if(!objectStack.empty()) {
                ConsCell newCell = new ConsCell();
                newList.setCdr(newCell);
                newList = newCell;
            }
        }
        return original;
    }
}
