package parse;

import eval.*;
import org.antlr.runtime.tree.Tree;
import parse.R5RSLexer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SchemeExpressionFactory {

    public SchemeExpression getExpression(Tree treeNode) {
        int t = treeNode.getType();

        if(t == R5RSLexer.VARIABLE) {
            return createVariableReference((R5RSParser.VariableNode) treeNode);
        }

        if(t == R5RSLexer.DEFINE) {
            return createDefineNode(treeNode);
        }

        if(t == R5RSLexer.PROCEDURECALL) {
            return createProcedureCall(treeNode);
        }

        if(t == R5RSLexer.BODY) {
            return createBody(treeNode);
        }

        if(t == R5RSLexer.LAMBDA) {
            return createLambda(treeNode);
        }

        if(t == R5RSLexer.BEGIN || t == R5RSLexer.SEQUENCE) {
            return createSequenceNode(treeNode);
        }

        if(t == R5RSLexer.IF) {
            return createIf(treeNode);
        }
        
        if(t == R5RSLexer.COND){
            return createCond(treeNode);
        }

        /* Literals */
        if(t == R5RSLexer.STR) {
            return getString(treeNode);
        }

        if(t == R5RSLexer.NUM10) {
            return getDecimalNumber(treeNode);
        }

        /* Wrappers */
        if(t == R5RSLexer.COMMAND || t == R5RSLexer.LITERAL || t == R5RSLexer.SELFEVALUATING || t == R5RSLexer.TEST) {
            return getExpression(treeNode.getChild(0));
        }

        return NilValue.NIL;
    }

    private SchemeExpression createCond(Tree treeNode) {
        List<CondClause> clauses = new LinkedList<>();
        SchemeExpression elseClause = null;

        for(int i = 0; i < treeNode.getChildCount(); i++) {
            Tree child = treeNode.getChild(i);
            if(child.getType() == R5RSLexer.CONDCLAUSE) {
                SchemeExpression test = getExpression(child.getChild(0));
                SchemeExpression realize = getExpression(child.getChild(1));
                CondClause clause = new CondClause(test, realize);
                clauses.add(clause);
            }
            else {
                elseClause = getExpression(child.getChild(0));
            }
        }

        return new Cond(clauses, elseClause);
    }

    private SchemeExpression createIf(Tree treeNode) {
        SchemeExpression test = getExpression(treeNode.getChild(0));
        SchemeExpression consequent = getExpression(treeNode.getChild(1));
        if(treeNode.getChildCount() > 2) {
            return new If(test, consequent, getExpression(treeNode.getChild(2)));
        }
        else {
            return new If(test, consequent);
        }
    }

    private SchemeExpression getDecimalNumber(Tree treeNode) {
        return new SchemeInteger(Integer.parseInt(treeNode.getChild(0).getText()));
    }

    private SchemeExpression getString(Tree treeNode) {
        // Strip quotes
        String text = treeNode.getChild(0).getText();
        SchemeString string = new SchemeString(text.substring(1, text.length() - 1));
        return string;
    }

    private SchemeExpression createLambda(Tree treeNode) {
        List<String> argumentIndentifiers = new LinkedList<>();
        String afterDotIdentifier = null;

        for(int i = 0; i < treeNode.getChildCount() - 1; i++) {
            Tree child = treeNode.getChild(i);
            if(child.getType() == R5RSLexer.EMPTYFORMALS) {
                break;
            }
            else if(child.getText().equals(".")) {
                afterDotIdentifier = treeNode.getChild(i + 1).getText();
                break;
            }
            else {
                argumentIndentifiers.add(child.getText());
            }
        }

        FunctionArguments arguments = new FunctionArguments(argumentIndentifiers, afterDotIdentifier);
        Body body = createBody(treeNode.getChild(treeNode.getChildCount() - 1));
        return new Lambda(arguments, body);
    }

    private Body createBody(Tree treeNode) {
        // Push defines until you encounter a sequence
        List<Define> defines = new LinkedList<>();
        for(int i = 0; i < treeNode.getChildCount() - 1; i++) {
            defines.add(createDefineNode(treeNode.getChild(i)));
        }
        Sequence sequence = createSequenceNode(treeNode.getChild(treeNode.getChildCount() - 1));
        return new Body(defines, sequence);
    }

    public SchemeProgram getProgram(Tree treeNode) {
        return new SchemeProgram(createSequenceNode(treeNode));
    }

    private Define createDefineNode(Tree tree) {
        //TODO: Formals
        String name = tree.getChild(0).getText();
        SchemeExpression expression = getExpression(tree.getChild(1));
        return new Define(name, expression);
    }

    private Sequence createSequenceNode(Tree tree) {
        List<SchemeExpression> schemeExpressionList = new ArrayList<>();
        for(int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            schemeExpressionList.add(getExpression(child));
        }
        return new Sequence(schemeExpressionList);
    }

    private VariableReference createVariableReference(R5RSParser.VariableNode tree) {
        String variableName = tree.getText();
        return new VariableReference(variableName);
    }

    private ProcedureCall createProcedureCall(Tree tree) {
        SchemeExpression operator = getExpression(tree.getChild(0));
        List<SchemeExpression> operands = new LinkedList<>();
        for(int i = 1; i < tree.getChildCount(); i++) {
            operands.add(getExpression(tree.getChild(i)));
        }
        return new ProcedureCall(operator, operands);
    }
}
