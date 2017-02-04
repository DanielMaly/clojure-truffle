package builtin;

import eval.SchemeNumber;
import eval.SchemeValue;

public class Util {

    public static boolean isNumber(SchemeValue value) {
        return value instanceof SchemeNumber;
    }
}
