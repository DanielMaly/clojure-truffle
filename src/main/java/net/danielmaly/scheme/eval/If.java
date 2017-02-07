package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.profiles.ConditionProfile;
import net.danielmaly.scheme.eval.literals.NilLiteral;
import net.danielmaly.scheme.types.NilValue;

public class If extends SchemeExpression {
    @Child private SchemeExpression test;
    @Child private SchemeExpression consequent;
    @Child private SchemeExpression alternate;

    private final ConditionProfile conditionProfile = ConditionProfile.createBinaryProfile();

    public If(SchemeExpression test, SchemeExpression consequent, SchemeExpression alternate) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = alternate;
    }

    public If(SchemeExpression test, SchemeExpression consequent) {
        this(test, consequent, new NilLiteral());
    }

    @Override
    public Object execute(VirtualFrame virtualFrame) {
        if (this.conditionProfile.profile(this.testResult(virtualFrame))) {
            return this.consequent.execute(virtualFrame);
        } else {
            return this.alternate.execute(virtualFrame);
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
