package net.danielmaly.scheme.builtin;

import net.danielmaly.scheme.eval.SchemeNumber;
import net.danielmaly.scheme.eval.SchemeValue;

public class Util {

    public static boolean isNumber(SchemeValue value) {
        return value instanceof SchemeNumber;
    }
}
