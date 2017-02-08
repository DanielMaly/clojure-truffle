package net.danielmaly.scheme.parse;

import com.oracle.truffle.api.frame.FrameSlot;
import com.sun.tools.javac.util.Pair;
import net.danielmaly.scheme.eval.*;
import net.danielmaly.scheme.eval.literals.FloatLiteral;
import net.danielmaly.scheme.eval.literals.IntegerLiteral;
import net.danielmaly.scheme.eval.literals.NilLiteral;
import net.danielmaly.scheme.eval.literals.StringLiteral;
import net.danielmaly.scheme.types.SchemeFunction;
import org.antlr.runtime.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class SchemeExpressionFactory {

    public SchemeExpression getExpression(Tree treeNode, Namespace ns) {
        int t = treeNode.getType();

        if(t == R5RSLexer.VARIABLE) {
            return createVariableReference((R5RSParser.VariableNode) treeNode, ns);
        }

        if(t == R5RSLexer.DEFINE) {
            return createDefineNode(treeNode, ns);
        }

        if(t == R5RSLexer.PROCEDURECALL) {
            return createProcedureCall(treeNode, ns);
        }

        if(t == R5RSLexer.LAMBDA) {
            return createLambda(treeNode, ns);
        }

        if(t == R5RSLexer.BEGIN || t == R5RSLexer.SEQUENCE || t == R5RSLexer.BODY) {
            return createSequenceNode(treeNode, ns);
        }

        if(t == R5RSLexer.IF) {
            return createIf(treeNode, ns);
        }
        
        if(t == R5RSLexer.COND) {
            return createCond(treeNode, ns);
        }

        if(t == R5RSLexer.STR) {
            return getString(treeNode);
        }

        if(t == R5RSLexer.NUM10) {
            return getDecimalNumber(treeNode);
        }

        if(t == R5RSLexer.COMMAND || t == R5RSLexer.LITERAL || t == R5RSLexer.SELFEVALUATING || t == R5RSLexer.TEST) {
            return getExpression(treeNode.getChild(0), ns);
        }

        return new NilLiteral();
    }

    public Sequence createSchemeProgram(Tree treeNode, Namespace ns) {
        return createSequenceNode(treeNode, ns);
    }

    private SchemeExpression createCond(Tree treeNode, Namespace ns) {
        SchemeExpression elseRealize = new NilLiteral();
        int clauseCount = treeNode.getChildCount();
        Tree lastNode = treeNode.getChild(treeNode.getChildCount() - 1);
        if(lastNode.getType() == R5RSLexer.ELSE) {
            clauseCount--;
            elseRealize = getExpression(lastNode.getChild(0), ns);
        }

        CondClause[] clauses = new CondClause[clauseCount];

        for(int i = 0; i < clauseCount; i++) {
            Tree child = treeNode.getChild(i);
            SchemeExpression test = getExpression(child.getChild(0), ns);
            SchemeExpression realize = getExpression(child.getChild(1), ns);
            clauses[i] = new CondClause(test, realize);

        }

        return new Cond(clauses, elseRealize);
    }

    private SchemeExpression createIf(Tree treeNode, Namespace ns) {
        SchemeExpression test = getExpression(treeNode.getChild(0), ns);
        SchemeExpression consequent = getExpression(treeNode.getChild(1), ns);
        if(treeNode.getChildCount() > 2) {
            return new If(test, consequent, getExpression(treeNode.getChild(2), ns));
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


    private SchemeExpression createLambda(Tree treeNode, Namespace ns) {
        Namespace inner = new Namespace("lambda", ns);
        List<FrameSlot> formalParameters = new LinkedList<>();

        for(int i = 0; i < treeNode.getChildCount() - 1; i++) {
            Tree child = treeNode.getChild(i);
            formalParameters.add(inner.addIdentifier(child.getText()));
        }

        SchemeExpression[] body = createSequenceNode(treeNode.getChild(treeNode.getChildCount() - 1), inner)
                .getExpressions();
        SchemeFunction function = SchemeFunction.create(
                formalParameters.toArray(new FrameSlot[] {}),
                body,
                inner.getFrameDescriptor()
        );
        return LambdaNodeGen.create(function);
    }

    private Define createDefineNode(Tree tree, Namespace ns) {
        String name = tree.getChild(0).getText();
        FrameSlot slot = ns.addIdentifier(name);
        SchemeExpression expression = getExpression(tree.getChild(1), ns);
        return DefineNodeGen.create(expression, slot);
    }


    private Sequence createSequenceNode(Tree tree, Namespace ns) {
        SchemeExpression[] expressions = new SchemeExpression[tree.getChildCount()];
        for(int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            expressions[i] = getExpression(child, ns);
        }
        return new Sequence(expressions);
    }

    private VariableReference createVariableReference(R5RSParser.VariableNode tree,
                                                      Namespace ns) {
        String variableName = tree.getText();
        Pair<Integer, FrameSlot> identifier = ns.getOrCreateIdentifier(variableName);
        return VariableReferenceNodeGen.create(identifier.snd, identifier.fst);
    }


    private ProcedureCall createProcedureCall(Tree tree, Namespace ns) {
        SchemeExpression operator = getExpression(tree.getChild(0), ns);
        SchemeExpression[] operands = new SchemeExpression[tree.getChildCount() - 1];
        for(int i = 1; i < tree.getChildCount(); i++) {
            operands[i-1] = getExpression(tree.getChild(i), ns);
        }
        return new ProcedureCall(operator, operands);
    }
}
