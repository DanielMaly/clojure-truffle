package builtin;

import eval.Environment;
import eval.SchemeException;
import eval.SchemeNumber;
import eval.SchemeValue;

import java.util.Arrays;

public class Minus extends NativeFunction {

    public Minus(Environment environment) {
        super(environment, Arrays.asList("a", "b"));
    }

    @Override
    SchemeValue callNative(Environment environment) throws SchemeException {
        SchemeValue a = environment.getValue("a");
        SchemeValue b = environment.getValue("b");

        if(!Util.isNumber(a) || !Util.isNumber(b)) {
            throw new SchemeException("Invalid arguments supplied to Minus: expecting numbers");
        }

        return ((SchemeNumber) a).minus((SchemeNumber) b);
    }
}
