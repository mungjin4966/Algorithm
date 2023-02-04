package bruteforce.flydocter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static void main(String[] agrs){
        Solution solution = new Solution();
        int[] arrA = new int[] {7,8,10,2};
        int[] arrB = new int[] {10,2,7,8};
//        int[] arrA = new int[] {4,3,2,1};
//        int[] arrB = new int[] {5,4,1,2};

        boolean value = solution.solution(arrA, arrB);
        System.out.println(value);
    }
}
