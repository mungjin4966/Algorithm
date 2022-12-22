package Mathematics.Measure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] measures = new int[Integer.parseInt(x)];

        for (int i = 0; i < measures.length; i++) {
            measures[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(measures);

        System.out.println(measures[0] * measures[measures.length - 1]);
    }
}
