package bruteforce.codeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] agrs) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] face = new int[N];

        for (int i = 0; i < N; i++) {
            face[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int left = 0;
        int right = 0;
        int temp = 0;

        for (int i = 0; i < N; i++) {
            if(N == 1){
                cnt++;
            }

            if (temp == face[i]) {
                cnt ++;
                System.out.println( temp +" "+ cnt);
            }else{
                System.out.println(cnt);
                left += cnt;
                cnt = 1;
            }


            temp = face[i];
        }
        System.out.println(left);
        System.out.println(Math.abs(right-left));
    }

}