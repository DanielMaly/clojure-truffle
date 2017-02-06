package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.frame.VirtualFrame;

public class VariableReference extends SchemeExpression {
    private String variable;

    public VariableReference(String variable) {
        this.variable = variable;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        return environment.getValue(variable);
    }

}
