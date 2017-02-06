package net.danielmaly.scheme.eval;

public abstract class SchemeValue extends SchemeExpression {

    public SchemeValue eval(Environment environment) throws SchemeException {
        return this;
    }

    public abstract String toSchemeString();
}
