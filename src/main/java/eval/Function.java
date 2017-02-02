package eval;

import java.util.List;

public class Function extends SchemeValue {

    private Environment closure;
    private Sequence sequence;
    private FunctionArguments formals;


    public Function(Sequence sequence, Environment environment, FunctionArguments formals) {
        this.sequence = sequence;
        this.closure = environment;
        this.formals = formals;
    }

    public SchemeValue call(ConsCell args) throws SchemeException {
        Environment functionEnvironment = new Environment(closure);
        this.formals.apply(functionEnvironment, args);
        return this.sequence.eval(functionEnvironment);
    }

}
