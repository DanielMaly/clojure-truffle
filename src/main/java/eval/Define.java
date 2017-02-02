package eval;

public class Define implements SchemeExpression {

    private String name;
    private SchemeExpression expression;

    public Define(String name, SchemeExpression expression) {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        SchemeValue value = expression.eval(environment);
        environment.putValue(name, value);
        return value;
    }
}
