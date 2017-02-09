package net.danielmaly.scheme.special;

import net.danielmaly.scheme.FileBasedTest;
import org.junit.Test;

public class FactorialTest extends FileBasedTest {
    @Test
    public void testBottlesOfBeer() throws Exception {
        this.assertOutputMatches("/factorial.scm", "/bottles.scm.result");
    }

}
