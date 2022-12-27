package Mathematics.bj6588;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class Bj6588Test extends TestCase {


    @Test
    public void testDecimalSum() throws IOException {
        Bj6588 bj6588 = new Bj6588();

        String input = "8\n20\n42\n0";

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        StringBuffer target = new StringBuffer();
        target.append("8 = 3 + 5\n").append("20 = 3 + 17\n").append("42 = 5 + 37\n");

        StringBuffer value = bj6588.decimalSum();

        Assert.assertEquals(target.toString(), value.toString());
    }
}