package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;
import net.danielmaly.scheme.types.SchemeFunction;

@NodeField(name = "function", type = SchemeFunction.class)
public abstract class Lambda extends SchemeExpression {
    public abstract SchemeFunction getFunction();

    private boolean scopeSet = false;

    @Specialization(guards = "isScopeSet()")
    public SchemeFunction getScopedFunction(VirtualFrame virtualFrame) {
        return this.getFunction();
    }

    @Specialization(contains = {"getScopedFunction"})
    public Object getSchemeFunction(VirtualFrame virtualFrame) {
        SchemeFunction function = this.getFunction();
        function.setLexicalScope(virtualFrame.materialize());
        return function;
    }

    protected boolean isScopeSet() {
        return this.scopeSet;
    }

    public static SchemeFunction createSchemeFunction(RootNode rootNode, VirtualFrame currentFrame) {
        return new SchemeFunction(Truffle.getRuntime().createCallTarget(rootNode));
    }
}