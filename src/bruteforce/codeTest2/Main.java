package bruteforce.codeTest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr1.add(Integer.parseInt(br.readLine()));
        }

        N = Integer.parseInt(br.readLine());
        List<Integer> arr2 = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            arr2.add(Integer.parseInt(br.readLine()));
        }

        int result = getMaxSumofArray(arr1, arr2);

    }


    public static int getMaxSumofArray(List<Integer> arr1, List<Integer> arr2){
        int[] resultList = new int[arr1.size()];
        Collections.sort(arr1);

        for (int i = 0; i < arr1.size(); i++) {
            resultList[i] = (i+1)*(arr2.get(i) - arr1.get(i));
        }

        int result = Arrays.stream(resultList).sum();
        System.out.println(result);


        return 0;
    }
}
