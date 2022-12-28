package bruteforce.bj3085;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;


public class Bj3085Test extends TestCase {

    @Test
    public void testCandy() throws IOException {
        Bj3085 bj3085 = new Bj3085();
        String input = "4\n" +
                "PPPP\n" +
                "CYZY\n" +
                "CCPY\n" +
                "PPCC";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int compare = 4;
        int value = bj3085.candy();

        Assert.assertEquals(compare, value);
    }
}