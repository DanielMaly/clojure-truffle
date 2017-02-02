package parse;

import eval.*;
import org.antlr.runtime.tree.Tree;
import parse.R5RSLexer;

import java.util.ArrayList;
import java.util.List;

public class SchemeExpressionFactory {

    public SchemeExpression getExpression(Tree treeNode) {
        int t = treeNode.getType();

        if(t == R5RSLexer.DEFINE) {
            return createDefineNode(treeNode);
        }

        if(t == R5RSLexer.BEGIN || t == R5RSLexer.SEQUENCE) {
            return createSequenceNode(treeNode);
        }

        if(t == R5RSLexer.COMMAND) {
            return getExpression(treeNode.getChild(0));
        }

        return new NilValue();
    }

    public SchemeProgram getProgram(Tree treeNode) {
        return new SchemeProgram(createSequenceNode(treeNode));
    }

    private SchemeExpression createDefineNode(Tree tree) {
        //TODO: Formals
        String name = tree.getChild(0).getText();
        SchemeExpression expression = getExpression(tree.getChild(1));
        return new Define(name, expression);
    }

    private SchemeExpression createSequenceNode(Tree tree) {
        List<SchemeExpression> schemeExpressionList = new ArrayList<>();
        for(int i = 0; i < tree.getChildCount(); i++) {
            Tree child = tree.getChild(i);
            schemeExpressionList.add(getExpression(child));
        }
        return new Sequence(schemeExpressionList);
    }
}
