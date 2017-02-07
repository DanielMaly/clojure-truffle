package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.profiles.ConditionProfile;
import net.danielmaly.scheme.types.NilValue;

public class CondClause extends SchemeExpression {
    @Child private SchemeExpression test;
    @Child private SchemeExpression realize;

    private final ConditionProfile conditionProfile = ConditionProfile.createBinaryProfile();

    public CondClause(SchemeExpression test, SchemeExpression realize) {
        this.test = test;
        this.realize = realize;
    }


    @Override
    public Object execute(VirtualFrame virtualFrame) {
        if (this.conditionProfile.profile(this.testResult(virtualFrame))) {
            return this.realize.execute(virtualFrame);
        } else {
            return NilValue.FALLTHROUGH;
        }
    }


    private boolean testResult(VirtualFrame virtualFrame) {
        try {
            return this.test.executeBoolean(virtualFrame);
        } catch (UnexpectedResultException e) {
            Object result = this.test.execute(virtualFrame);
            return result != NilValue.NIL;
        }
    }
}
