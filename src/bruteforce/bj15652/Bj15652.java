package bruteforce.bj15652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj15652 {

    public static int[] list;
    public static int N,M;

    public void sequence() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new int[M];
        numList(1,0);
    }

    public void numList(int at, int depth){

        if(M == depth){
            for (int num: list) {
                System.out.print(num);
            }
            System.out.println();
            return;
        }

        for (int i = at; i <= N; i++) {
            list[depth] = i;
            numList(i,depth+1);
        }

    }

}
