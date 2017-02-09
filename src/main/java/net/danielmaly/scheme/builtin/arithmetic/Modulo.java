package net.danielmaly.scheme.builtin.arithmetic;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "%")
@GenerateNodeFactory
public abstract class Modulo extends BuiltinExpression {

    @Specialization
    public long modulo(long a, long b) {
        return a % b;
    }
}
