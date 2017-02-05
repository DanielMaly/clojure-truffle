package net.danielmaly.scheme.eval;

import java.util.List;

public class Sequence implements SchemeExpression {
    private List<SchemeExpression> children;

    public Sequence(List<SchemeExpression> children) {
        this.children = children;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        SchemeValue result = new NilValue();
        for(SchemeExpression exp : children) {
            result = exp.eval(environment);
        }
        return result;
    }
}
