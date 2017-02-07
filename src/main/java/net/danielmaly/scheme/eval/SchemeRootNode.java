package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.RootNode;


public class SchemeRootNode extends RootNode {
    @Children private SchemeExpression[] children;

    public SchemeRootNode(SchemeExpression[] children, FrameDescriptor frameDescriptor) {
        super(SchemeLanguage.class, null, frameDescriptor);
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

    public static SchemeRootNode create(FrameSlot[] argumentNames, SchemeExpression[] bodyNodes,
                                        FrameDescriptor frameDescriptor) {
        SchemeExpression[] allNodes = new SchemeExpression[argumentNames.length + bodyNodes.length];
        for (int i=0; i<argumentNames.length; i++) {
            allNodes[i] = DefineNodeGen.create(new ReadFunctionArgument(i), argumentNames[i]);
        }
        System.arraycopy(bodyNodes, 0, allNodes, argumentNames.length, bodyNodes.length);
        return new SchemeRootNode(allNodes, frameDescriptor);
    }
}
