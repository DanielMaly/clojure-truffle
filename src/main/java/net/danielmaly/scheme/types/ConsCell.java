package net.danielmaly.scheme.types;

import net.danielmaly.scheme.builtin.list.Cons;

public class ConsCell {
    private Object car;
    private Object cdr;

    public ConsCell() {
        this(NilValue.NIL, NilValue.NIL);
    }

    public ConsCell(Object car) {
        this(car, NilValue.NIL);
    }

    public ConsCell(Object car, Object cdr) {
        this.car = car;
        this.cdr = cdr;
    }

    public Object getCar() {
        return car;
    }

    public void setCar(Object car) {
        this.car = car;
    }

    public Object getCdr() {
        return cdr;
    }

    public void setCdr(Object cdr) {
        this.cdr = cdr;
    }

    @Override
    public String toString() {
        return "(cons " + car.toString() + " " + cdr.toString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ConsCell)) {
            return false;
        }
        ConsCell other = (ConsCell) obj;
        return car.equals(other.car) && cdr.equals(other.cdr);
    }
}
