package net.danielmaly.scheme.lang;

import org.junit.Test;


public class SyntaxTest extends FileBasedTest {

    @Test
    public void testBottlesOfBeer() throws Exception {
        this.assertOutputMatches("/bottles.ss", "/bottles.ss.result");
    }
}
