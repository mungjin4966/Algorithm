package bruteforce.bj1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1107 {

    public int live = 100;

    public int remote() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        char[] target = n.toCharArray();

        int broken = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int brokenNums[] = new int[broken];
        for (int i = 0; i < broken; i++) {
            brokenNums[i] = Integer.parseInt(st.nextToken());
        }

        boolean remocon[] = new boolean[10];
        Arrays.fill(remocon, true);

        for (int i = 0; i < remocon.length; i++) {
            for (int j = 0; j < brokenNums.length ; j++) {
                if(i == brokenNums[j]){
                    remocon[i] = false;
                }
            }
        }

        int cnt = 0;
        int[] value = new int[n.length()];

        if (live == Integer.parseInt(n)) {
            System.out.println(cnt);
        }

        for (int i = 0; i < target.length; i++) {
            for (int l = 0; l < remocon.length; l++) {
                if(Integer.parseInt(String.valueOf(target[i])) == l && remocon[l]){
                    value[i] = l;
                }
                
            }
        }


        return 0;
    }
}
