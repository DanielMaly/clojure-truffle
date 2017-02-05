package net.danielmaly.scheme.eval;

public abstract class SchemeValue implements SchemeExpression {

    public SchemeValue eval(Environment environment) throws SchemeException {
        return this;
    }

    public abstract String toSchemeString();
}
