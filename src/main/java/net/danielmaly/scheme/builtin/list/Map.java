package net.danielmaly.scheme.builtin.list;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.eval.Utils;
import net.danielmaly.scheme.types.ConsCell;
import net.danielmaly.scheme.types.NilValue;
import net.danielmaly.scheme.types.SchemeFunction;

@NodeInfo(shortName = "map")
@GenerateNodeFactory
public abstract class Map extends BuiltinExpression {

    @Specialization
    public Object map(VirtualFrame frame, SchemeFunction function, ConsCell list1) {
        ConsCell newList = new ConsCell();
        ConsCell original = newList;
        Object current = list1;
        do {
            ConsCell currentCell = (ConsCell) current;
            Object arg = currentCell.getCar();

            Object value = Utils.callFunction(frame, function, arg);

            newList.setCar(value);
            current = currentCell.getCdr();
            if(current instanceof ConsCell) {
                ConsCell newCell = new ConsCell();
                newList.setCdr(newCell);
                newList = newCell;
            }
        } while(current instanceof ConsCell);

        return original;
    }
}
