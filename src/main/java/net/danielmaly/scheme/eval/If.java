package net.danielmaly.scheme.eval;

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
        if(!(testResult instanceof SchemeBoolean)) {
            throw new SchemeException("Expected a boolean as the result of an IF test");
        }

        SchemeBoolean result = (SchemeBoolean) testResult;
        if(result.equals(SchemeBoolean.TRUE)) {
            return this.consequent.eval(environment);
        }
        else {
            return this.alternate.eval(environment);
        }
    }
}
