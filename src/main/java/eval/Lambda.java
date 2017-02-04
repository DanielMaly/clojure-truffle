package eval;

public class Lambda implements SchemeExpression {
    private FunctionArguments arguments;
    private Body body;

    public Lambda(FunctionArguments arguments, Body body) {
        this.arguments = arguments;
        this.body = body;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        return new Function(body, environment, arguments);
    }
}
