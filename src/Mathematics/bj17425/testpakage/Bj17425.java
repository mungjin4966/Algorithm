package Mathematics.bj17425.testpakage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj17425 {

    public int[] test() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] value = new int[testCase];

        for (int x = 1; x <= testCase; x++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(n);
            int result = 0;
            for (int i = 1; i <= n; i++) {
                result += (n / i) * i;
            }
            value[x-1] = result;
        }

        return value;
    }

    public long[] case2() throws IOException {
        int max = 1_000_001;
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

        long[] result = new long[testCase];
        for (int i = 0; i < testCase; i++) {
            result[i] = caseSum[Integer.parseInt(br.readLine())];
        }

        return result;
    }

    
}
