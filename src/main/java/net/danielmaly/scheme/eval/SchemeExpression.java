package net.danielmaly.scheme.eval;

public interface SchemeExpression extends SchemeNode {
    SchemeValue eval(Environment environment) throws SchemeException;
}