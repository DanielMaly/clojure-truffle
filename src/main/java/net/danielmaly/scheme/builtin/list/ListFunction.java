package net.danielmaly.scheme.builtin.list;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.ConsCell;
import net.danielmaly.scheme.types.NilValue;

@NodeInfo(shortName = "list")
@GenerateNodeFactory
public class ListFunction extends BuiltinExpression {

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        Object[] objects = virtualFrame.getArguments();
        ConsCell consCell = new ConsCell();
        ConsCell original = consCell;

        for(int i = 1; i < objects.length; i++) {
            Object object = objects[i];
            if(!consCell.getCar().equals(NilValue.NIL)) {
                ConsCell old = consCell;
                consCell = new ConsCell();
                old.setCdr(consCell);
            }
            consCell.setCar(object);
        }

        return original;
    }
}
