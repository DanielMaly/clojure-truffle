package net.danielmaly.scheme.eval;

import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.MaterializedFrame;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import net.danielmaly.scheme.types.ConsCell;
import net.danielmaly.scheme.types.SchemeFunction;

@NodeInfo(language = "Scheme Language", description = "The abstract base node for all expressions")
public abstract class SchemeExpression extends Node {
    public abstract Object execute(VirtualFrame virtualFrame);

    public long executeLong(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.expectLong(this.execute(virtualFrame));
    }

    public double executeDouble(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.expectDouble(this.execute(virtualFrame));
    }

    public boolean executeBoolean(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.expectBoolean(this.execute(virtualFrame));
    }

    public String executeString(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.expectString(this.execute(virtualFrame));
    }

    public SchemeFunction executeSchemeFunction(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.expectSchemeFunction(this.execute(virtualFrame));
    }

    public ConsCell executeConsCell(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.expectConsCell(this.execute(virtualFrame));
    }

    protected boolean isArgumentIndexInRange(VirtualFrame virtualFrame,
                                             int index) {
        return (index + 1) < virtualFrame.getArguments().length;
    }

    protected Object getArgument(VirtualFrame virtualFrame, int index) {
        return virtualFrame.getArguments()[index + 1];
    }

    protected static MaterializedFrame getLexicalScope(Frame frame) {
        Object[] args = frame.getArguments();
        if (args.length > 0) {
            return (MaterializedFrame) frame.getArguments()[0];
        } else {
            return null;
        }
    }
}
