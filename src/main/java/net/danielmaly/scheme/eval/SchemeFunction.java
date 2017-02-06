package net.danielmaly.scheme.eval;

public class SchemeFunction extends SchemeValue {

    private Environment closure;
    private Body body;
    private FunctionArguments formals;

    public SchemeFunction() {

    }

    public SchemeFunction(Body body, Environment environment, FunctionArguments formals) {
        this.body = body;
        this.closure = environment;
        this.formals = formals;
    }

    public SchemeValue call(ConsCell args) throws SchemeException {
        Environment functionEnvironment = new Environment(closure);
        this.formals.apply(functionEnvironment, args);
        return this.body.eval(functionEnvironment);
    }

    public void setClosure(Environment closure) {
        this.closure = closure;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setFormals(FunctionArguments formals) {
        this.formals = formals;
    }

    @Override
    public String toSchemeString() {
        return "[SchemeFunction]";
    }
}
