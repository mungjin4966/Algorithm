package bj17425;

import Mathematics.bj17425.testpakage.Bj17425;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class MainTest {
    private static Bj17425 bj17425;

    @Before
    public void 싱글톤_패턴(){
        bj17425 = new Bj17425();
    }

// 1초 기준 1억회

    @Test(timeout = 1000) //최대한 오래 걸리는 테스트 케이스를 사용해야됨
    public void 약수의_합_테스트() throws IOException {

        String first = "5\n" +
                "1\n" +
                "2\n" +
                "10\n" +
                "70\n" +
                "10000";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(first.getBytes());
        System.setIn(in);

        long[] value = bj17425.case2();
        long[] target = {1, 4, 87, 4065, 82256014};

        Assert.assertArrayEquals(target, value);
    }
}
