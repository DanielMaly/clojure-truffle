import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import parse.R5RSLexer;
import parse.R5RSParser;

public class Main {
    public static void main(String[] args) throws Exception {


//        ClojureLexer lexer = new ClojureLexer(new ANTLRInputStream(Main.class.getClassLoader().getResourceAsStream("bottles.clj")));
//        ClojureParser parser = new ClojureParser(new CommonTokenStream(lexer));
//        System.out.println(parser.file());

        R5RSLexer lexer = new R5RSLexer(new ANTLRInputStream(Main.class.getClassLoader().getResourceAsStream("bottles.ss")));
        R5RSParser parser = new R5RSParser(new CommonTokenStream(lexer));
        CommonTree tree = (CommonTree) parser.parse().getTree();
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        System.out.println(st);
    }
}