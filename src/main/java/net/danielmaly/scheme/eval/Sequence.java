package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.RootNode;
import net.danielmaly.scheme.types.NilValue;

import java.util.List;

public class Sequence extends SchemeExpression {
    @Children private SchemeExpression[] children;

    public Sequence(SchemeExpression[] children) {
        this.children = children;
    }


    @Override
    @ExplodeLoop
    public Object execute(VirtualFrame virtualFrame) {
        int secondToLast = this.children.length - 1;
        CompilerAsserts.compilationConstant(secondToLast);
        for (int i=0; i<secondToLast; i++) {
            this.children[i].execute(virtualFrame);
        }
        return this.children[secondToLast].execute(virtualFrame);
    }
}
