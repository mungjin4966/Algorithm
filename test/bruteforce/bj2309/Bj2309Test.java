package bruteforce.bj2309;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.io.*;

class Bj2309Test {

    @Test
    void dwarf() throws IOException {
        Bj2309 bj2309 = new Bj2309();

        String input = "20\n7\n23\n19\n10\n15\n25\n8\n13";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        StringBuffer value = bj2309.dwarf();
        StringBuffer target = new StringBuffer();
        target.append("7\n8\n10\n13\n19\n20\n23");

        Assert.assertEquals(value.toString(), target.toString());

    }
}