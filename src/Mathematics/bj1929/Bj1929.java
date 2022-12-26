package Mathematics.bj1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1929 {

    public StringBuffer decimal() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuffer sb = new StringBuffer();
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());


        boolean arr[] = new boolean[n+1];
        // 0과 1은 소수가 아님
        arr[0] = true;
        arr[1] = true;


        for (int i = 2; i <= Math.sqrt(n); i++) { // 여기서 왜 제곱의 범위까지 하는지 확인 필요
            System.out.println("i는 2부터 n의 제곱근 까지 : " + i);
            for (int r = i*i; r <= n; r+=i) { // 여기서 r = i*i가 되는 이유와 r+=i를 하는 이유
                System.out.println("2의 배수 : " + r);
                arr[r] = true;
            }
        }

        for (int j = m; j <= n; j++) {
            if(arr[j] ==false){
                System.out.println(j);
                sb.append(j).append("\n");
            }
        }

        return sb;
    }
}
