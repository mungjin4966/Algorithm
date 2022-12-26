package Mathematics.bj1929;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class Bj1978Test extends TestCase {

//    public void setUp() throws Exception {
//        super.setUp();
//    }

    @Test(timeout = 2000)
    public void testDecimal() throws IOException {

        Bj1929 bj1978 = new Bj1929();
        String input = "3 16";

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        StringBuffer targer = new StringBuffer();
        targer.append(3).append("\n").append(5).append("\n").append(7).append("\n").append(11).append("\n").append(13).append("\n");
        String test = targer.toString();

        StringBuffer sb = bj1978.decimal();
        String value = sb.toString();

        Assert.assertEquals(test, value);
    }

}