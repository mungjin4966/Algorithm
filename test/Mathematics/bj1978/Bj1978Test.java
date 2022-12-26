package Mathematics.bj1978;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.io.*;

public class Bj1978Test extends TestCase {


    @Test
    public void testDecimalCnt() throws IOException {
        Bj1978 bj1978 = new Bj1978();

        String first = "4\n 1 3 5 7";
        OutputStream out  = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(first.getBytes());
        System.setIn(in);

        int value = bj1978.decimalCnt();
        int result = 3;

        Assert.assertEquals(value,result);
    }
}