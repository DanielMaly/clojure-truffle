package net.danielmaly.scheme.eval;

import net.danielmaly.scheme.eval.literals.BooleanLiteral;

public class CondClause {
    private SchemeExpression test;
    private SchemeExpression realize;

    public CondClause(SchemeExpression test, SchemeExpression realize) {
        this.test = test;
        this.realize = realize;
    }

    public boolean shouldRealize(Environment env) throws SchemeException {
        SchemeValue testResult = test.eval(env);
        if(!(testResult instanceof BooleanLiteral)) {
            throw new SchemeException("Expected a boolean as the result of an IF test");
        }

        BooleanLiteral result = (BooleanLiteral) testResult;
        return result.equals(BooleanLiteral.TRUE);
    }

    public SchemeExpression getRealize() {
        return realize;
    }
}
