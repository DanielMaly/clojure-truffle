package net.danielmaly.scheme.builtin;

import com.oracle.truffle.api.dsl.NodeChild;
import net.danielmaly.scheme.eval.SchemeExpression;

@NodeChild(value = "arguments", type = SchemeExpression[].class)
public abstract class BuiltinExpression extends SchemeExpression {
}
