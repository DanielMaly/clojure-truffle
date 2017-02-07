package net.danielmaly.scheme.types;

public class NilValue {

    private String value;

    public static final NilValue NIL = new NilValue("NIL");
    public static final NilValue FALLTHROUGH = new NilValue("FALLTHROUGH");

    private NilValue(String value) {this.value = value;}

    @Override
    public boolean equals(Object obj) {
        return this.value.equals(obj.toString()) && obj instanceof NilValue;
    }

    @Override
    public String toString() {
        return value;
    }
}
