package net.danielmaly.scheme.eval;

public class SchemeString extends SchemeValue {
    private String value;

    public SchemeString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toSchemeString() {
        return value;
    }
}
