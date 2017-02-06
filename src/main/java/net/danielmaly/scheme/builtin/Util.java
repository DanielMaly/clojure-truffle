package net.danielmaly.scheme.builtin;

public class Util {

    public static boolean isNumber(SchemeValue value) {
        return value instanceof SchemeNumber;
    }
}
