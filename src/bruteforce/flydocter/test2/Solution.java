package bruteforce.flydocter.test2;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] p) {
        int answer = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
//                int temp = p[j][0];
//                p[j][0] = p[j][1];
//                p[j][1] = temp;

                if (Arrays.equals(p[i], p[j])) {
                    answer++;
                }
            }
        }


        return answer;
    }
}
