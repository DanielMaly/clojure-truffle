package net.danielmaly.scheme.eval;

public class CondClause {
    private SchemeExpression test;
    private SchemeExpression realize;

    public CondClause(SchemeExpression test, SchemeExpression realize) {
        this.test = test;
        this.realize = realize;
    }

    public boolean shouldRealize(Environment env) throws SchemeException {
        SchemeValue testResult = test.eval(env);
        if(!(testResult instanceof SchemeBoolean)) {
            throw new SchemeException("Expected a boolean as the result of an IF test");
        }

        SchemeBoolean result = (SchemeBoolean) testResult;
        return result.equals(SchemeBoolean.TRUE);
    }

    public SchemeExpression getRealize() {
        return realize;
    }
}
