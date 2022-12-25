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
        StringBuffer sb = new StringBuffer();

        int testCase = Integer.parseInt(br.readLine());

        long[] caseValue = new long[max];
        long[] caseSum = new long[max];

        Arrays.fill(caseValue,1);
        // 로그 형태로 감소함 logN
        for (int i = 2; i < max; i++) {
            for (int j = 1; i*j < max; j++) {
                caseValue[i*j] += i;
            }
        }
        // 컴퓨터에서 ++는 연산에 강함
        for(int i=1; i<max; i++) {
            caseSum[i] = caseSum[i-1] + caseValue[i];
        }

        while (testCase-- > 0){
            int caseDate = Integer.parseInt(br.readLine());

            sb.append(caseSum[caseDate]).append("\n");
        }
        System.out.println(sb);
    }
}