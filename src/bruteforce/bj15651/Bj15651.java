package bruteforce.bj15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15651 {

    public static StringBuffer sb;
    public static int N, M;
    public static int[] numbers;

    public StringBuffer numberList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[M];

        sb = new StringBuffer();
        sequence(0);

        return sb;
    }

    public void sequence(int depth) {
        if (depth == M) {
            for (int val : numbers) {
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            numbers[depth] = i + 1;
            sequence(depth + 1);
        }
    }
}

