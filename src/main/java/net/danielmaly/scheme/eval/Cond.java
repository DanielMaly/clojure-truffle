package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.ConditionProfile;
import net.danielmaly.scheme.types.NilValue;

import java.util.List;

public class Cond extends SchemeExpression {

    @Children private CondClause[] clauses;
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
