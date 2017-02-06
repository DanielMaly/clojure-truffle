package net.danielmaly.scheme.eval;

public interface Evaluable {
    SchemeValue eval(Environment environment) throws SchemeException;
}
