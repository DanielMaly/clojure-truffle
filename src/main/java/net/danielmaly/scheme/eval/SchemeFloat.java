package net.danielmaly.scheme.eval;

public class SchemeFloat extends SchemeNumber {
    private double value;

    public SchemeFloat(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public Number getNativeNumer() {
        return value;
    }

    @Override
    public SchemeNumber minus(SchemeNumber other) {
        return new SchemeFloat(value - other.getNativeNumer().doubleValue());
    }

    @Override
    public SchemeNumber plus(SchemeNumber other) {
        return new SchemeFloat(value + other.getNativeNumer().doubleValue());
    }

    @Override
    public SchemeNumber times(SchemeNumber other) {
        return new SchemeFloat(value * other.getNativeNumer().doubleValue());
    }

    @Override
    public SchemeNumber dividedBy(SchemeNumber other) {
        return new SchemeFloat(value / other.getNativeNumer().doubleValue());
    }
}
