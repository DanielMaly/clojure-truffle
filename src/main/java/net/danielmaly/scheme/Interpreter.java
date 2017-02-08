package net.danielmaly.scheme;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.DirectCallNode;
import net.danielmaly.scheme.eval.SchemeContext;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.eval.Sequence;
import net.danielmaly.scheme.parse.Namespace;
import net.danielmaly.scheme.parse.R5RSLexer;
import net.danielmaly.scheme.parse.R5RSParser;
import net.danielmaly.scheme.parse.SchemeExpressionFactory;
import net.danielmaly.scheme.types.SchemeFunction;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;


import java.io.InputStream;
import java.util.Stack;
import java.util.stream.StreamSupport;

public class Interpreter {
    public static void main(String[] args) throws Exception {

    }

    public static void executeProgram(InputStream source) throws Exception {
        R5RSLexer lexer = new R5RSLexer(new ANTLRInputStream(source));
        R5RSParser parser = new R5RSParser(new CommonTokenStream(lexer));
        CommonTree tree = (CommonTree) parser.parse().getTree();
        SchemeExpressionFactory factory = new SchemeExpressionFactory();

        SchemeContext context = new SchemeContext();
        Namespace globalNs = new Namespace(context.getGlobalFrameDescriptor());

        Sequence sequence = factory.createSchemeProgram(tree, globalNs);
        SchemeFunction function = SchemeFunction.create(new FrameSlot[] {}, sequence.getExpressions(), globalNs.getFrameDescriptor());
        DirectCallNode directCallNode = Truffle.getRuntime().createDirectCallNode(function.callTarget);
        directCallNode.call(context.getGlobalFrame(), new Object[] {context.getMaterializedGlobalFrame()});
    }

}