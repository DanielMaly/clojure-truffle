package net.danielmaly.scheme.eval;

public class SchemeBoolean extends SchemeValue {

    private Boolean value;

    private SchemeBoolean(Boolean value) {
        this.value = value;
    }

    public static final SchemeBoolean TRUE = new SchemeBoolean(true);
    public static final SchemeBoolean FALSE = new SchemeBoolean(false);

    public static SchemeBoolean get(boolean b) {
        return b ? TRUE : FALSE;
    }

    @Override
    public String toSchemeString() {
        return value ? "#t" : "#f";
    }
}
