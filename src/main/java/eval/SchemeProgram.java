package eval;

import org.antlr.runtime.tree.CommonTree;

public class SchemeProgram {

    private Environment globalScope;
    private SchemeExpression expression;

    public SchemeProgram(SchemeExpression expression) {
        globalScope = new Environment();
    }

    public void execute() throws SchemeException {
        expression.eval(globalScope);
    }
}
