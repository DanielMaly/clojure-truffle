package eval;

public class VariableReference implements SchemeExpression {
    private String variable;

    public VariableReference(String variable) {
        this.variable = variable;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        return environment.getValue(variable);
    }
}
