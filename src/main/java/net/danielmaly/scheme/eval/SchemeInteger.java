package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

public class SchemeInteger extends SchemeNumber {
    private long value;

    public SchemeInteger(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public Number getNativeNumber() {
        return value;
    }

    @Override
    public SchemeNumber minus(SchemeNumber other) {
        if(other instanceof SchemeInteger) {
            return new SchemeInteger(value - ((SchemeInteger) other).getValue());
        }
        else {
            return new SchemeFloat((double) value - other.getNativeNumber().doubleValue());
        }
    }

    @Override
    public SchemeNumber plus(SchemeNumber other) {
        if(other instanceof SchemeInteger) {
            return new SchemeInteger(value + ((SchemeInteger) other).getValue());
        }
        else {
            return new SchemeFloat((double) value + other.getNativeNumber().doubleValue());
        }
    }

    @Override
    public SchemeNumber times(SchemeNumber other) {
        if(other instanceof SchemeInteger) {
            return new SchemeInteger(value * ((SchemeInteger) other).getValue());
        }
        else {
            return new SchemeFloat((double) value * other.getNativeNumber().doubleValue());
        }
    }

    @Override
    public SchemeNumber dividedBy(SchemeNumber other) {
        double value = getValue() / other.getNativeNumber().doubleValue();
        if(other instanceof SchemeInteger) {
            return new SchemeInteger((long) value);
        }
        else {
            return new SchemeFloat(value);
        }
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return value;
    }

    @Override
    public long executeLong(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return value;
    }
}
