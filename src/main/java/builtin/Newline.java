package builtin;

import eval.Environment;
import eval.NilValue;
import eval.SchemeException;
import eval.SchemeValue;

import java.util.Collections;

public class Newline extends NativeFunction{
    public Newline(Environment environment) {
        super(environment, Collections.<String>emptyList());
    }

    @Override
    SchemeValue callNative(Environment environment) throws SchemeException {
        System.out.println();
        return NilValue.NIL;
    }
}
