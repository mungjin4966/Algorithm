package Mathematics.bj2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int gcd = getGCD(Math.max(num1, num2), Math.min(num1,num2));

        sb.append(gcd).append("\n").append((num1*num2)/gcd);
        System.out.println(sb);
    }

    // 유클리드 호제법 최대공약수
    public static int getGCD(int num1, int num2){
        while (num2>0){
            int tmp = num1;
            num1 = num2;
            num2 = tmp%num2;
        }
        return num1;
    }
}
