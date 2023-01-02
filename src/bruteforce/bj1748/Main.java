package bruteforce.bj1748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] agrs) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int conut = 0;
        int plus = 1;
        int num = 10;
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if(i % num == 0){
                plus++;
                num *=10;
            }
            conut += plus;
        }

        System.out.println(conut);
    }
}
