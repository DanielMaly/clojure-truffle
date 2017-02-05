package net.danielmaly.scheme.builtin;

import net.danielmaly.scheme.eval.Environment;
import net.danielmaly.scheme.eval.NilValue;
import net.danielmaly.scheme.eval.SchemeException;
import net.danielmaly.scheme.eval.SchemeValue;

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
