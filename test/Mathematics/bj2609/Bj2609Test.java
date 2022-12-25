package Mathematics.bj2609;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class Bj2609Test extends TestCase {


    @Test(timeout = 1000)
    public void testNumberTheory() throws IOException {

        Bj2609 bj2609 = new Bj2609();
        String first = "36 60";

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(first.getBytes());
        System.setIn(in);

        StringBuffer value = bj2609.numberTheory();
        String result = value.toString();

        StringBuffer sb = new StringBuffer();
        sb.append(12).append("\n").append(180);
        String same = sb.toString();

        Assert.assertEquals(same,result);
    }

}