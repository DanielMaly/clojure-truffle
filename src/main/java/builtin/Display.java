package builtin;

import eval.Environment;
import eval.NilValue;
import eval.SchemeException;
import eval.SchemeValue;

import java.util.Collections;

public class Display extends NativeFunction {
    public Display(Environment environment) {
        super(environment, Collections.singletonList("a"));
    }

    @Override
    SchemeValue callNative(Environment environment) throws SchemeException {
        System.out.print(environment.getValue("a").toSchemeString());
        return NilValue.NIL;
    }
}
