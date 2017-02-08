package net.danielmaly.scheme.eval.logical;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.ConditionProfile;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.eval.Utils;
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
        if (this.conditionProfile.profile(Utils.testResult(test, virtualFrame))) {
            return this.realize.execute(virtualFrame);
        } else {
            return NilValue.FALLTHROUGH;
        }
    }

}
