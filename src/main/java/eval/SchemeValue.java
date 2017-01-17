package eval;

public abstract class SchemeValue implements SchemeExpression {
    public SchemeValue eval() throws SchemeException {
        return this;
    }
}
