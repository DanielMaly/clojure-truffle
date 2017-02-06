package net.danielmaly.scheme.eval;

import net.danielmaly.scheme.eval.literals.BooleanLiteral;

public class If extends SchemeExpression {
    private SchemeExpression test;
    private SchemeExpression consequent;
    private SchemeExpression alternate;

    public If(SchemeExpression test, SchemeExpression consequent, SchemeExpression alternate) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = alternate;
    }

    public If(SchemeExpression test, SchemeExpression consequent) {
        this(test, consequent, NilValue.NIL);
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        SchemeValue testResult = test.eval(environment);
        if(!(testResult instanceof BooleanLiteral)) {
            throw new SchemeException("Expected a boolean as the result of an IF test");
        }

        BooleanLiteral result = (BooleanLiteral) testResult;
        if(result.equals(BooleanLiteral.TRUE)) {
            return this.consequent.eval(environment);
        }
        else {
            return this.alternate.eval(environment);
        }
    }
}
