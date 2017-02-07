package net.danielmaly.scheme;

import com.oracle.truffle.api.frame.VirtualFrame;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.parse.R5RSLexer;
import net.danielmaly.scheme.parse.R5RSParser;
import net.danielmaly.scheme.parse.SchemeExpressionFactory;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;


import java.io.InputStream;

public class Interpreter {
    public static void main(String[] args) throws Exception {

    }

    public static void executeProgram(InputStream source) throws Exception {
        System.out.println("Whee");
    }

    public static SchemeExpression constructProgram(InputStream source) throws Exception {
        R5RSLexer lexer = new R5RSLexer(new ANTLRInputStream(source));
        R5RSParser parser = new R5RSParser(new CommonTokenStream(lexer));
        CommonTree tree = (CommonTree) parser.parse().getTree();
        SchemeExpressionFactory factory = new SchemeExpressionFactory();
        return factory.getExpression(tree);
    }


}