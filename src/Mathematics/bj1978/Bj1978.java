package Mathematics.bj1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1978 {

    public int decimalCnt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean arr[] = new boolean[1001];
        arr[0] = arr[1] = true;

        for (int i = 2; i <= Math.sqrt(1001); i++) {
            for (int j = i*i; j <= 1000; j+=i) {
                arr[j] = true;
            }
        }
        int result = 0;

        for (int i = 0; i < nCnt; i++) {
           if(arr[Integer.parseInt(st.nextToken())]== false){
                result++;
           }
        }

        return result;
    }
}
