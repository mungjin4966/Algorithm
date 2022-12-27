package Mathematics.bj6588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MAX = 1000000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Boolean decimal[] = new Boolean[MAX];
        StringBuffer sb = new StringBuffer();

        Arrays.fill(decimal, true);
        decimal[0] = false;
        decimal[1] = false;

        for (int i = 2; i < Math.sqrt(MAX); i++) {
            for (int j = i*i; j < MAX; j+=i) {
                decimal[j] = false;
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            boolean check = false;

            if(n == 0){
                break;
            }

            for (int j = 3; j <= n; j+=2) {
                if(decimal[j] && decimal[n-j]){
                    sb.append(n +" = "+ j +" + "+(n-j)+"\n");
                    check = true;
                    break;
                }
            }

            if(!check){
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }
        }
        System.out.println(sb);
    }
}
