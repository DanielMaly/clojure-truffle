package net.danielmaly.scheme.eval;

import java.util.List;

public class Body implements SchemeExpression {

    private List<Define> definitions;
    private Sequence sequence;

    public Body(List<Define> definitions, Sequence sequence) {
        this.definitions = definitions;
        this.sequence = sequence;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        for(Define def: definitions) {
            def.eval(environment);
        }
        return sequence.eval(environment);
    }

}
