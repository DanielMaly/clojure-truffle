package net.danielmaly.scheme.eval;

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
        return SchemeTypesGen.SCHEMETYPES.expectLong(this.execute(virtualFrame));
    }

    public double executeDouble(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.SCHEMETYPES.expectDouble(this.execute(virtualFrame));
    }

    public boolean executeBoolean(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.SCHEMETYPES.expectBoolean(this.execute(virtualFrame));
    }

    public String executeString(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.SCHEMETYPES.expectString(this.execute(virtualFrame));
    }

    public SchemeFunction executeSchemeFunction(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.SCHEMETYPES.expectSchemeFunction(this.execute(virtualFrame));
    }

    public ConsCell executeConsCell(VirtualFrame virtualFrame) throws UnexpectedResultException {
        return SchemeTypesGen.SCHEMETYPES.expectConsCell(this.execute(virtualFrame));
    }
}
