package net.danielmaly.scheme.builtin;

import net.danielmaly.scheme.eval.Environment;
import net.danielmaly.scheme.eval.SchemeException;
import net.danielmaly.scheme.eval.SchemeNumber;
import net.danielmaly.scheme.eval.SchemeValue;

import java.util.Arrays;

public abstract class ArithmeticFunction extends NativeFunction {

    public ArithmeticFunction(Environment environment) {
        super(environment, Arrays.asList("a", "b"));
    }

    @Override
    SchemeValue callNative(Environment environment) throws SchemeException {
        SchemeValue a = environment.getValue("a");
        SchemeValue b = environment.getValue("b");

        if(!Util.isNumber(a) || !Util.isNumber(b)) {
            throw new SchemeException("Invalid arguments supplied to Minus: expecting numbers");
        }

        return evaluateArithmetic((SchemeNumber) a, (SchemeNumber) b);
    }

    protected abstract SchemeNumber evaluateArithmetic(SchemeNumber a, SchemeNumber b) throws SchemeException;
}

class Minus extends ArithmeticFunction {


    public Minus(Environment environment) {
        super(environment);
    }

    @Override
    protected SchemeNumber evaluateArithmetic(SchemeNumber a, SchemeNumber b) throws SchemeException {
        return a.minus(b);
    }
}

class Plus extends ArithmeticFunction {


    public Plus(Environment environment) {
        super(environment);
    }

    @Override
    protected SchemeNumber evaluateArithmetic(SchemeNumber a, SchemeNumber b) throws SchemeException {
        return a.plus(b);
    }
}

class Times extends ArithmeticFunction {


    public Times(Environment environment) {
        super(environment);
    }

    @Override
    protected SchemeNumber evaluateArithmetic(SchemeNumber a, SchemeNumber b) throws SchemeException {
        return a.times(b);
    }
}

class DividedBy extends ArithmeticFunction {

    public DividedBy(Environment environment) {
        super(environment);
    }

    @Override
    protected SchemeNumber evaluateArithmetic(SchemeNumber a, SchemeNumber b) throws SchemeException {
        return a.dividedBy(b);
    }
}