package builtin;

import eval.*;

import java.util.Arrays;

public class Equality extends NativeFunction {

    enum Mode {
        ADDRESS,
        PRIMITIVE,
        PRIMITIVE_NUMERIC,
        COMPOUND
    }

    private Mode mode;

    public Equality(Environment environment, Mode mode) {
        super(environment, Arrays.asList("a", "b"));
        this.mode = mode;
    }

    @Override
    SchemeValue callNative(Environment environment) throws SchemeException {
        SchemeValue a = environment.getValue("a");
        SchemeValue b = environment.getValue("b");

        if(mode.equals(Mode.ADDRESS)) {
            return SchemeBoolean.get(a == b);
        }
        else if(mode.equals(Mode.PRIMITIVE_NUMERIC)) {
            return compareNumbers(a, b);
        }
        else {
            throw new SchemeException("Equality mode " + mode + " isn't supported.");
        }
    }

    SchemeBoolean compareNumbers(SchemeValue a, SchemeValue b) throws SchemeException {
        if(!(Util.isNumber(a) && Util.isNumber(b))) {
            throw new SchemeException("Expected numeric types");
        }

        return SchemeBoolean.get(((SchemeNumber) a).getNativeNumer().equals(((SchemeNumber) b).getNativeNumer()));
    }
}
