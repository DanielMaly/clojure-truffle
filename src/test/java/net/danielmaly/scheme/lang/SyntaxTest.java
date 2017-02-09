package net.danielmaly.scheme.lang;

import org.junit.Test;


public class SyntaxTest extends FileBasedTest {

    @Test
    public void testBottlesOfBeer() throws Exception {
        this.assertOutputMatches("/bottles.scm", "/bottles.scm.result");
    }

    @Test
    public void testRec() throws Exception {
        this.assertOutputMatches("/rec.scm", "/rec.scm.result");
    }

    @Test
    public void testSyntax() throws Exception {
        this.assertOutputMatches("/syntax.scm", "/syntax.scm.result");
    }
}
