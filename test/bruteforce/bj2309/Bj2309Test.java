package bruteforce.bj2309;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class Bj2309Test extends TestCase {

    @Test
    public void testDwarf() throws IOException {
        Bj2309 bj2309 = new Bj2309();
        String input = "20\n7\n23\n19\n10\n15\n25\n8\n13";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        StringBuffer value = bj2309.dwarf();
        StringBuffer target = new StringBuffer();
        target.append("7\n").append("8\n").append("10\n").append("13\n").append("19\n").append("20\n").append("23\n");

        String result = value.toString();
        String comparision = target.toString();

        Assert.assertEquals(result, comparision);
    }
}