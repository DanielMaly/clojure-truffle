package net.danielmaly.scheme.eval.logical;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.ConditionProfile;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.eval.Utils;
import net.danielmaly.scheme.eval.literals.NilLiteral;

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
        if (this.conditionProfile.profile(Utils.testResult(this.test, virtualFrame))) {
            return this.consequent.execute(virtualFrame);
        } else {
            return this.alternate.execute(virtualFrame);
        }
    }

}
