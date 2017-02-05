package net.danielmaly.scheme.eval;

import java.util.List;

public class Cond implements SchemeExpression {

    private List<CondClause> clauseList;
    private SchemeExpression elseRealize;

    public Cond(List<CondClause> clauseList, SchemeExpression elseRealize) {
        this.clauseList = clauseList;
        this.elseRealize = elseRealize;
    }

    @Override
    public SchemeValue eval(Environment environment) throws SchemeException {
        for(CondClause clause : clauseList) {
            if(clause.shouldRealize(environment)) {
                return clause.getRealize().eval(environment);
            }
        }

        if(elseRealize != null) {
            return elseRealize.eval(environment);
        }

        return NilValue.NIL;
    }
}
