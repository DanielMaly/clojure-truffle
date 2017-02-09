package net.danielmaly.scheme;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.MaterializedFrame;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.DirectCallNode;
import net.danielmaly.scheme.eval.SchemeContext;
import net.danielmaly.scheme.eval.SchemeExpression;
import net.danielmaly.scheme.eval.Sequence;
import net.danielmaly.scheme.eval.literals.NilLiteral;
import net.danielmaly.scheme.parse.Namespace;
import net.danielmaly.scheme.parse.R5RSLexer;
import net.danielmaly.scheme.parse.R5RSParser;
import net.danielmaly.scheme.parse.SchemeExpressionFactory;
import net.danielmaly.scheme.types.SchemeFunction;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.StreamSupport;

public class Interpreter {
    public static void main(String[] args) throws Exception {
        runREPL();
    }

    public static void runREPL() throws IOException, RecognitionException {
        SchemeContext context = new SchemeContext();
        SchemeExpressionFactory factory = new SchemeExpressionFactory(context);
        Namespace globalNs = new Namespace(context.getGlobalFrameDescriptor());

        Namespace replNamespace = new Namespace(Namespace.TOP_NS, globalNs);
        VirtualFrame replFrame = Truffle.getRuntime().createVirtualFrame(
                new Object[]{context.getMaterializedGlobalFrame()}, replNamespace.getFrameDescriptor()
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("\\q")) {
                System.out.println("Bye");
                System.exit(0);
            }
            InputStream stream = new ByteArrayInputStream(line.getBytes(StandardCharsets.UTF_8));
            R5RSLexer lexer = new R5RSLexer(new ANTLRInputStream(stream));
            R5RSParser parser = new R5RSParser(new CommonTokenStream(lexer));
            CommonTree tree = (CommonTree) parser.parse().getTree();
            try {
                Sequence sequence = factory.createSchemeProgram(tree, replNamespace);

                SchemeExpression[] expressions = sequence.getExpressions();

                if (expressions[expressions.length - 1] instanceof NilLiteral) {
                    SchemeExpression[] newExpressions = new SchemeExpression[expressions.length - 1];
                    for (int i = 0; i < expressions.length - 1; i++) {
                        newExpressions[i] = expressions[i];
                    }
                    expressions = newExpressions;
                }

                SchemeFunction function = SchemeFunction.create(new FrameSlot[]{}, expressions, replFrame.getFrameDescriptor());
                DirectCallNode directCallNode = Truffle.getRuntime().createDirectCallNode(function.callTarget);

                Sequence callSequence = new Sequence(expressions);
                Object value = callSequence.execute(replFrame);
                //Object value = directCallNode.call(replFrame, new Object[]{context.getMaterializedGlobalFrame()});

                System.out.println(value);
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
            System.out.print("> ");
        }
    }

    public static DirectCallNode constructFromInputStream(InputStream source, SchemeContext context) throws Exception {
        R5RSLexer lexer = new R5RSLexer(new ANTLRInputStream(source));
        R5RSParser parser = new R5RSParser(new CommonTokenStream(lexer));
        CommonTree tree = (CommonTree) parser.parse().getTree();

        SchemeExpressionFactory factory = new SchemeExpressionFactory(context);
        Namespace globalNs = new Namespace(context.getGlobalFrameDescriptor());

        Namespace fileNamespace = new Namespace(Namespace.TOP_NS, globalNs);

        Sequence sequence = factory.createSchemeProgram(tree, fileNamespace);
        SchemeFunction function = SchemeFunction.create(new FrameSlot[]{}, sequence.getExpressions(), globalNs.getFrameDescriptor());
        DirectCallNode directCallNode = Truffle.getRuntime().createDirectCallNode(function.callTarget);

        return directCallNode;
    }

    public static void executeFromInputStream(InputStream source) throws Exception {
        SchemeContext context = new SchemeContext();
        DirectCallNode directCallNode = constructFromInputStream(source, context);
        execute(directCallNode, context);
    }

    public static void execute(DirectCallNode directCallNode, SchemeContext context) {
        directCallNode.call(context.getGlobalFrame(), new Object[]{context.getMaterializedGlobalFrame()});
    }

}