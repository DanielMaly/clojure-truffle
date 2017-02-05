package net.danielmaly.scheme.eval;

public class SchemeInteger extends SchemeNumber {
    private int value;

    public SchemeInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Number getNativeNumer() {
        return value;
    }

    @Override
    public SchemeNumber minus(SchemeNumber other) {
        if(other instanceof SchemeInteger) {
            return new SchemeInteger(value - ((SchemeInteger) other).getValue());
        }
        else {
            return new SchemeFloat((double) value - other.getNativeNumer().doubleValue());
        }
    }
}
