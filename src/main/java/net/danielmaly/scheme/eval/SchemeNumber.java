package net.danielmaly.scheme.eval;

public abstract class SchemeNumber extends SchemeValue {
    public abstract Number getNativeNumer();

    public abstract SchemeNumber minus(SchemeNumber other);
    public abstract SchemeNumber plus(SchemeNumber other);
    public abstract SchemeNumber times(SchemeNumber other);
    public abstract SchemeNumber dividedBy(SchemeNumber other);


    @Override
    public String toSchemeString() {
        return getNativeNumer().toString();
    }
}
