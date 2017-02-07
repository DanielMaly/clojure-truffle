package net.danielmaly.scheme.parse;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotKind;
import net.danielmaly.scheme.eval.*;
import net.danielmaly.scheme.eval.literals.FloatLiteral;
import net.danielmaly.scheme.eval.literals.IntegerLiteral;
import net.danielmaly.scheme.eval.literals.NilLiteral;
import net.danielmaly.scheme.eval.literals.StringLiteral;
import net.danielmaly.scheme.types.SchemeFunction;
import org.antlr.runtime.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SchemeExpressionFactory {

    public SchemeExpression getExpression(Tree treeNode, Stack<FrameDescriptor> frameDescriptors) {
        int t = treeNode.getType();

        if(t == R5RSLexer.VARIABLE) {
            return createVariableReference((R5RSParser.VariableNode) treeNode, frameDescriptors);
        }

        if(t == R5RSLexer.DEFINE) {
            return createDefineNode(treeNode, frameDescriptors);
        }

        if(t == R5RSLexer.PROCEDURECALL) {
            return createProcedureCall(treeNode, frameDescriptors);
        }

        if(t == R5RSLexer.LAMBDA) {
            return createLambda(treeNode, frameDescriptors);
        }

        if(t == R5RSLexer.BEGIN || t == R5RSLexer.SEQUENCE || t == R5RSLexer.BODY) {
            return createSequenceNode(treeNode, frameDescriptors);
        }

        if(t == R5RSLexer.IF) {
            return createIf(treeNode, frameDescriptors);
        }
        
        if(t == R5RSLexer.COND) {
            return createCond(treeNode, frameDescriptors);
        }

        if(t == R5RSLexer.STR) {
            return getString(treeNode);
        }

        if(t == R5RSLexer.NUM10) {
            return getDecimalNumber(treeNode);
        }

        if(t == R5RSLexer.COMMAND || t == R5RSLexer.LITERAL || t == R5RSLexer.SELFEVALUATING || t == R5RSLexer.TEST) {
            return getExpression(treeNode.getChild(0), frameDescriptors);
        }

        return new NilLiteral();
    }

    public Sequence createSchemeProgram(Tree treeNode, Stack<FrameDescriptor> frameDescriptors) {
        return createSequenceNode(treeNode, frameDescriptors);
    }

    private SchemeExpression createCond(Tree treeNode, Stack<FrameDescriptor> frameDescriptors) {
        SchemeExpression elseRealize = new NilLiteral();
        int clauseCount = treeNode.getChildCount();
        Tree lastNode = treeNode.getChild(treeNode.getChildCount() - 1);
        if(lastNode.getType() == R5RSLexer.ELSE) {
            clauseCount--;
            elseRealize = getExpression(lastNode.getChild(0), frameDescriptors);
        }

        CondClause[] clauses = new CondClause[clauseCount];

        for(int i = 0; i < clauseCount; i++) {
            Tree child = treeNode.getChild(i);
            SchemeExpression test = getExpression(child.getChild(0), frameDescriptors);
            SchemeExpression realize = getExpression(child.getChild(1), frameDescriptors);
            clauses[i] = new CondClause(test, realize);

        }

        return new Cond(clauses, elseRealize);
    }

    private SchemeExpression createIf(Tree treeNode, Stack<FrameDescriptor> frameDescriptors) {
        SchemeExpression test = getExpression(treeNode.getChild(0), frameDescriptors);
        SchemeExpression consequent = getExpression(treeNode.getChild(1), frameDescriptors);
        if(treeNode.getChildCount() > 2) {
            return new If(test, consequent, getExpression(treeNode.getChild(2), frameDescriptors));
        }
        else {
            return new If(test, consequent);
        }
    }

    private SchemeExpression getDecimalNumber(Tree treeNode) {
        try {
            return new IntegerLiteral(Integer.parseInt(treeNode.getChild(0).getText()));
        } catch(NumberFormatException ex) {
            return new FloatLiteral(Double.parseDouble(treeNode.getChild(0).getText()));
        }
    }

    private SchemeExpression getString(Tree treeNode) {
        // Strip quotes
        String text = treeNode.getChild(0).getText();
        return new StringLiteral(text.substring(1, text.length() - 1));
    }


    private SchemeExpression createLambda(Tree treeNode, Stack<FrameDescriptor> frameDescriptors) {
        frameDescriptors.push(new FrameDescriptor());
        List<FrameSlot> formalParameters = new LinkedList<>();

        for(int i = 0; i < treeNode.getChildCount() - 1; i++) {
            Tree child = treeNode.getChild(i);
            formalParameters.add(frameDescriptors.peek().findOrAddFrameSlot(child.getText()));
        }

        SchemeExpression[] body = createSequenceNode(treeNode.getChild(treeNode.getChildCount() - 1), frameDescriptors)
                .getExpressions();
        SchemeFunction function = SchemeFunction.create(
                formalParameters.toArray(new FrameSlot[] {}),
                body,
                frameDescriptors.peek()
        );
        frameDescriptors.pop();
        return LambdaNodeGen.create(function);
    }

    private Define createDefineNode(Tree tree, Stack<FrameDescriptor> frameDescriptors) {
        String name = tree.getChild(0).getText();
        SchemeExpression expression = getExpression(tree.getChild(1), frameDescriptors);
        return DefineNodeGen.create(expression, frameDescriptors.peek().findOrAddFrameSlot(name));
    }


    private Sequence createSequenceNode(Tree tree, Stack<FrameDescriptor> frameDescriptors) {
        SchemeExpression[] expressions = new SchemeExpression[tree.getChildCount()];
        for(int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            expressions[i] = getExpression(child, frameDescriptors);
        }
        return new Sequence(expressions);
    }

    private VariableReference createVariableReference(R5RSParser.VariableNode tree,
                                                      Stack<FrameDescriptor> frameDescriptors) {
        String variableName = tree.getText();
        return VariableReferenceNodeGen.create(frameDescriptors.peek().findOrAddFrameSlot(variableName));
    }


    private ProcedureCall createProcedureCall(Tree tree, Stack<FrameDescriptor> frameDescriptors) {
        SchemeExpression operator = getExpression(tree.getChild(0), frameDescriptors);
        SchemeExpression[] operands = new SchemeExpression[tree.getChildCount() - 1];
        for(int i = 1; i < tree.getChildCount(); i++) {
            operands[i-1] = getExpression(tree.getChild(i), frameDescriptors);
        }
        return new ProcedureCall(operator, operands);
    }
}
