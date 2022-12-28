package bruteforce.bj1476;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class Bj1476Test extends TestCase {

    @Test
    public void testDayCnt() throws IOException {

        Bj1476 bj1476 = new Bj1476();
        String input = "1 16 16";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int target = 16;
        int result = bj1476.dayCnt();

        Assert.assertEquals(target, result);
    }
}