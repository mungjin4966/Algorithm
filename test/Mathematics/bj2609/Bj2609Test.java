package Mathematics.bj2609;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class Bj2609Test extends TestCase {

    private static Bj2609 bj2609;

    @Before
    public void 싱글통() {
        bj2609 = new Bj2609();
    }

    @Test(timeout = 1000)
    public void testNumberTheory() throws IOException {

        // null poinException에러가 계속 도출됨;;
        String first = "36 60";

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(first.getBytes());
        System.setIn(in);

        StringBuffer value = bj2609.numberTheory();

        StringBuffer sb = new StringBuffer();
        sb.append(12).append("\n").append(180);
        System.out.println(sb);
        System.out.println(value);
//        Assert.assertEquals(sb, value);

    }

}