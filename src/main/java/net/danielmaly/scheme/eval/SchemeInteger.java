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

    @Override
    public SchemeNumber plus(SchemeNumber other) {
        if(other instanceof SchemeInteger) {
            return new SchemeInteger(value + ((SchemeInteger) other).getValue());
        }
        else {
            return new SchemeFloat((double) value + other.getNativeNumer().doubleValue());
        }
    }

    @Override
    public SchemeNumber times(SchemeNumber other) {
        if(other instanceof SchemeInteger) {
            return new SchemeInteger(value * ((SchemeInteger) other).getValue());
        }
        else {
            return new SchemeFloat((double) value * other.getNativeNumer().doubleValue());
        }
    }

    @Override
    public SchemeNumber dividedBy(SchemeNumber other) {
        double value = getValue() / other.getNativeNumer().doubleValue();
        if(other instanceof SchemeInteger) {
            return new SchemeInteger((int) value);
        }
        else {
            return new SchemeFloat(value);
        }
    }
}
