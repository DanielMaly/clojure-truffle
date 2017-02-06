package net.danielmaly.scheme.builtin;

import net.danielmaly.scheme.eval.*;

import java.util.Arrays;

public class Ordering extends NativeFunction {

    enum Direction {
        GREATER_THAN_OR_EQUAL,
        GREATER_THAN,
        LESS_THAN,
        LESS_THAN_OR_EQUAL
    }

    private Direction direction;

    public Ordering(Environment environment, Direction direction) {
        super(environment, Arrays.asList("a", "b"));
        this.direction = direction;
    }

    @Override
    SchemeValue callNative(Environment environment) throws SchemeException {
        SchemeValue a = environment.getValue("a");
        SchemeValue b = environment.getValue("b");

        if(!(Util.isNumber(a) && Util.isNumber(b))) {
            throw new SchemeException("Expected numeric types");
        }

        return SchemeBoolean.get(evaluate((SchemeNumber) a, (SchemeNumber) b));
    }

    private Boolean evaluate(SchemeNumber a, SchemeNumber b) {
        double n1 = a.getNativeNumber().doubleValue();
        double n2 = b.getNativeNumber().doubleValue();
        switch(direction) {
            case GREATER_THAN:
                return n1 > n2;
            case GREATER_THAN_OR_EQUAL:
                return n1 >= n2;
            case LESS_THAN:
                return n1 < n2;
            case LESS_THAN_OR_EQUAL:
                return n1 <= n2;
        }
        return false;
    }
}
