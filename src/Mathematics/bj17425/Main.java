package Mathematics.bj17425;

import Mathematics.bj17425.testpakage.Bj17425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static final int max = 1_000_001;
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] caseValue = new int[max];

        Arrays.fill(caseValue,1);

        for (int i = 2; i < max; i++) {
            for (int j = 1; i*j < max; j++) {
                caseValue[i*j] += i;
            }
        }

        long[] caseSum = new long[max];
        for(int i=1; i<max; i++) {
            caseSum[i] = caseSum[i-1] + caseValue[i];
        }

        for (int i = 0; i < testCase; i++) {
            System.out.println(caseSum[Integer.parseInt(br.readLine())]);
        }
    }
}
