package net.danielmaly.scheme.builtin.conversion;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "string")
@GenerateNodeFactory
public abstract class ToString extends BuiltinExpression {

    @Specialization
    public String toString(Object value) {
        return value.toString();
    }
}
