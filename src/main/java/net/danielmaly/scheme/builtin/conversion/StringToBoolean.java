package net.danielmaly.scheme.builtin.conversion;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "string->boolean")
@GenerateNodeFactory
public abstract class StringToBoolean extends BuiltinExpression {

    @Specialization
    public boolean stringToBoolean(String value) {
        String s = value.toLowerCase();
        switch (s) {
            case "#t":
            case "true":
                return true;
            case "#f":
            case "false":
                return false;
            default:
                throw new RuntimeException("Cannot convert " + value + " to a boolean");
        }
    }
}
