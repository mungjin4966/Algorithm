package bruteforce.bj9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());

        int[] nums = new int[11];

        nums[1] = 1; // 1을 만들기 위해 1 1가지 경우의 수
        nums[2] = 2; // 2를 만들기 위해 2,1+1 2가지 경우의 수
        nums[3] = 4; // 3을 만들기 위해 3, 1+1+1, 2+1, 1+2 4가지 경우의 수
        // 다음식은 이전의 값을 더하면 현재의 값의 경우의 수가 나옴
        for (int i = 4; i <= 10 ; i++) {
            nums[i] = nums[i-3] + nums[i-2] + nums[i-1];
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(nums[n]+"\n");
        }
        System.out.println(sb);
    }


}