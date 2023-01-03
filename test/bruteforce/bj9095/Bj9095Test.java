package bruteforce.bj9095;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;


public class Bj9095Test extends TestCase {

    @Test
    public void testbj9095번 () throws IOException {
        Bj9095 bj9095 = new Bj9095();
        String input = "3\n" +
                "4\n" +
                "7\n" +
                "10";

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        StringBuffer sb = new StringBuffer();
        sb.append("7\n").append("44\n").append("274\n");
        String value = sb.toString();
        StringBuffer same = bj9095.puls();
        String target = same.toString();

        Assert.assertEquals(value,target);
    }
}