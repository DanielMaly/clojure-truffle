package eval;

public class ConsCell extends SchemeValue {
    private SchemeValue car;
    private SchemeValue cdr;

    public ConsCell() {
        this(NilValue.NIL, NilValue.NIL);
    }

    public ConsCell(SchemeValue car) {
        this(car, NilValue.NIL);
    }

    public ConsCell(SchemeValue car, SchemeValue cdr) {
        this.car = car;
        this.cdr = cdr;
    }

    public SchemeValue getCar() {
        return car;
    }

    public void setCar(SchemeValue car) {
        this.car = car;
    }

    public SchemeValue getCdr() {
        return cdr;
    }

    public void setCdr(SchemeValue cdr) {
        this.cdr = cdr;
    }

    @Override
    public String toSchemeString() {
        return "(" + getCar().toSchemeString() + " " + getCdr().toSchemeString() + ")";
    }
}
