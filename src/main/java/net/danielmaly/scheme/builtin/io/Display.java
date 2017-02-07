package net.danielmaly.scheme.builtin.io;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "display")
@GenerateNodeFactory
public abstract class Display extends BuiltinExpression {

    @Specialization
    public long display(long value) {
        System.out.print(value);
        return value;
    }

    @Specialization
    public double display(double value) {
        System.out.print(value);
        return value;
    }

    @Specialization
    public boolean display(boolean value) {
        System.out.print(value);
        return value;
    }

    @Specialization
    public Object display(Object value) {
        System.out.print(value);
        return value;
    }
}
