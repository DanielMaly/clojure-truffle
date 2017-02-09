package net.danielmaly.scheme.builtin.conversion;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "string->number")
@GenerateNodeFactory
public abstract class StringToNumber extends BuiltinExpression {

    @Specialization
    public Number stringToNumber(String value) {
        try {
            return Long.parseLong(value);
        }
        catch(Exception ex) {
            return Double.parseDouble(value);
        }
    }
}
