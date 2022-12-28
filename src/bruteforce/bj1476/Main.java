package bruteforce.bj1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] agrs) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());

        int result = 1;
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;

        while (true){
            if(num1 == first && num2 == two && num3 == three){
                break;
            }

            num1++;
            num2++;
            num3++;
            result++;

            if(num1 == 16){
                num1 = 1;
            }
            if(num2 == 29){
                num2 = 1;
            }
            if(num3 == 20){
                num3 = 1;
            }
        }
        System.out.println(result);
    }
}
