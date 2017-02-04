package eval;

import builtin.GlobalEnvironment;

public class SchemeProgram {

    private GlobalEnvironment globalScope;
    private SchemeExpression expression;

    public SchemeProgram(SchemeExpression expression) {
        globalScope = new GlobalEnvironment();
        globalScope.setup();
        this.expression = expression;
    }

    public void execute() throws SchemeException {
        Environment programScope = new Environment(globalScope);
        expression.eval(programScope);
    }
}
