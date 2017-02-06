package net.danielmaly.scheme.eval;

public class Lambda extends SchemeExpression {
    private FunctionArguments arguments;
    private Body body;

    public Lambda(FunctionArguments arguments, Body body) {
        this.arguments = arguments;
        this.body = body;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        return new SchemeFunction(body, environment, arguments);
    }
}
