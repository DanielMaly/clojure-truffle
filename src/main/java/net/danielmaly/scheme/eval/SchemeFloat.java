package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

public class SchemeFloat extends SchemeNumber {
    private double value;

    public SchemeFloat(double value) {
        this.value = value;
    }

    @Override
    public Number getNativeNumber() {
        return value;
    }

    @Override
    public SchemeNumber minus(SchemeNumber other) {
        return new SchemeFloat(value - other.getNativeNumber().doubleValue());
    }

    @Override
    public SchemeNumber plus(SchemeNumber other) {
        return new SchemeFloat(value + other.getNativeNumber().doubleValue());
    }

    @Override
    public SchemeNumber times(SchemeNumber other) {
        return new SchemeFloat(value * other.getNativeNumber().doubleValue());
    }

    @Override
    public SchemeNumber dividedBy(SchemeNumber other) {
        return new SchemeFloat(value / other.getNativeNumber().doubleValue());
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        return value;
    }

    @Override
    public double executeDouble(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return value;
    }
}
