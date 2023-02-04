package bruteforce.flydocter;

import java.util.Arrays;

public class Solution {
    public boolean solution(int[] arrA, int[] arrB) {
        boolean answer = false;

        for (int j = 0; j < arrA.length; j++) {
            int temp = arrA[arrA.length - 1]; // 1
            for (int i = arrA.length - 1; i >= 1; i--) {
                arrA[i] = arrA[i - 1];
            }
            arrA[0] = temp;

            if (Arrays.equals(arrA, arrB)) {
                answer = true;
                break;
            }
        }

        return answer;
    }
}
