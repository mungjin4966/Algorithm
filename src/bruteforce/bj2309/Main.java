package bruteforce.bj2309;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int numbers[] = new int[9];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum - numbers[i]-numbers[j] == 100){
                    numbers[i] = 0;
                    numbers[j] = 0;
                    Arrays.sort(numbers);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(numbers[k]);
                    }
                }
                break;
            }
        }
    }
}
