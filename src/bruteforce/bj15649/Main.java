package bruteforce.bj15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0); // 1<= M <= N <= 8의 조건에 일치하는 값을 출력하는 함수를 만듬
    }

    public static void dfs(int N, int M, int depth) {

        if (depth == M) { // M의 길이와 depth의 길이가 같을때 출력하고 함수를 종료함
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        // 핵심
        for (int i = 0; i < N; i++) { // N 만큼 반복문을 수행함
            if (!visit[i]) {
                visit[i] = true; // 탐색한 값을 다시 탐색하지 않음
                arr[depth] = i + 1; // 1 ~ 시작되는 조건을 맞추기 위해 I +1을 수행함
                dfs(N, M, depth + 1); // 재귀 함수를 통해 해당 함수를 반복함
                visit[i] = false; // 콜백 함수가 종료되는 시점 즉 M의 첫번째 문이 출력되고 이후 해당 탐색 값을 초기화 하여 다음 값을 넣어줌
            }
        }
    }
}
