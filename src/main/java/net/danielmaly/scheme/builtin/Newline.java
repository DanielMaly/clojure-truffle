package net.danielmaly.scheme.builtin;

import net.danielmaly.scheme.eval.*;

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
