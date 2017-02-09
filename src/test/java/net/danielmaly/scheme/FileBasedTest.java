package net.danielmaly.scheme;

import net.danielmaly.scheme.Interpreter;
import org.junit.Assert;
import sun.misc.IOUtils;

import java.io.*;


public class FileBasedTest {

    protected void assertOutputMatches(String inFileName, String referenceFileName)
            throws Exception {
        assertOutputMatches(inFileName, referenceFileName, null);
    }

    protected void assertOutputMatches(String inFileName, String referenceFileName, String stdInFileName)
            throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        if(stdInFileName != null) {
            System.setIn(getClass().getResourceAsStream(stdInFileName));
        }

        InputStream sourceStream = getClass().getResourceAsStream(inFileName);
        Interpreter.executeFromInputStream(sourceStream);

        InputStream referenceStream = getClass().getResourceAsStream(referenceFileName);
        byte[] bytes = IOUtils.readFully(referenceStream, -1, true);

        Assert.assertEquals(new String(bytes), new String(outContent.toByteArray()));

        System.setOut(null);
        System.setErr(null);
    }
}
