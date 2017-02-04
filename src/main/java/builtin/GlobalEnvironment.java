package builtin;

import eval.Environment;

import java.util.Arrays;

public final class GlobalEnvironment extends Environment {

    public GlobalEnvironment() {}

    public void setup() {
        this.setupArithmetic();
        this.setupOrdering();
        this.setupEquality();
        this.setupOutput();
    }

    private void setupArithmetic() {
        this.putValue("-", new Minus(this));
    }

    private void setupEquality() {
        this.putValue("=", new Equality(this, Equality.Mode.PRIMITIVE_NUMERIC));
    }

    private void setupOutput() {
        this.putValue("display", new Display(this));
        this.putValue("newline", new Newline(this));
    }

    private void setupOrdering() {
        this.putValue("<", new Ordering(this, Ordering.Direction.LESS_THAN));
        this.putValue(">", new Ordering(this, Ordering.Direction.GREATER_THAN));
        this.putValue("<=", new Ordering(this, Ordering.Direction.LESS_THAN_OR_EQUAL));
        this.putValue(">=", new Ordering(this, Ordering.Direction.LESS_THAN_OR_EQUAL));
    }
}
