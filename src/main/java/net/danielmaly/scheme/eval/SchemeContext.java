package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.dsl.NodeFactory;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.MaterializedFrame;
import com.oracle.truffle.api.frame.VirtualFrame;
import net.danielmaly.scheme.builtin.BuiltinExpression;
import net.danielmaly.scheme.types.SchemeFunction;

public class SchemeContext {
    private final FrameDescriptor globalFrameDescriptor;
    private final MaterializedFrame globalFrame;

    public SchemeContext() {
        this.globalFrameDescriptor = new FrameDescriptor();
        this.globalFrame = this.initGlobalFrame();
    }

    private MaterializedFrame initGlobalFrame() {
        VirtualFrame frame = Truffle.getRuntime().createVirtualFrame(null, this.globalFrameDescriptor);
        addGlobalFunctions(frame);
        return frame.materialize();
    }

    private static void addGlobalFunctions(VirtualFrame virtualFrame) {
        FrameDescriptor frameDescriptor = virtualFrame.getFrameDescriptor();
    }

    /**
     * @return A {@link MaterializedFrame} on the heap that contains all global
     * values.
     */
    public MaterializedFrame getGlobalFrame() {
        return this.globalFrame;
    }

    public static SchemeFunction createBuiltinFunction(
            NodeFactory<? extends BuiltinExpression> factory,
            FrameDescriptor frameDescriptor)
    {
        int argumentCount = factory.getExecutionSignature().size();
        SchemeExpression[] argumentNodes = new SchemeExpression[argumentCount];
        for (int i=0; i<argumentCount; i++) {
            argumentNodes[i] = new ReadFunctionArgument(i);
        }
        BuiltinExpression node = factory.createNode((Object) argumentNodes);
        return new SchemeFunction(Truffle.getRuntime().createCallTarget(
                new SchemeRootNode(new SchemeExpression[] {node}, frameDescriptor)));
    }


}
