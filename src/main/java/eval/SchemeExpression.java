package eval;

public interface SchemeExpression extends SchemeNode {
    SchemeValue eval() throws SchemeException;
}
