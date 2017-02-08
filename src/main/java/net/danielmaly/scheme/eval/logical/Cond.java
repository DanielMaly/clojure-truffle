package net.danielmaly.scheme.eval.logical;

import com.oracle.truffle.api.frame.VirtualFrame;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.types.NilValue;

public class Cond extends SchemeExpression {

    @Children private final CondClause[] clauses;
    @Child private SchemeExpression elseRealize;

    public Cond(CondClause[] clauses, SchemeExpression elseRealize) {
        this.clauses = clauses;
        this.elseRealize = elseRealize;
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        for (CondClause clause : clauses) {
            Object result = clause.execute(virtualFrame);
            if (result != NilValue.FALLTHROUGH) {
                return result;
            }
        }
        return elseRealize.execute(virtualFrame);
    }
}
