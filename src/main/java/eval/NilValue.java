package eval;

public class NilValue extends SchemeValue {

    public static final NilValue NIL = new NilValue();

    @Override
    public boolean equals(Object obj) {
        return obj instanceof NilValue;
    }


    @Override
    public String toSchemeString() {
        return "NIL";
    }
}
