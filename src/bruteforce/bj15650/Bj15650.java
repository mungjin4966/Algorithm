package bruteforce.bj15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15650 {
    public static StringBuffer sb;

    public static int[] number;
    public static int N, M;

    public StringBuffer numbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        number = new int[M]; // M길이 만큼의 배열을 생성함

        sb = new StringBuffer();
        result(0, 1); // 값을 구하는 함수 호출

        return sb;

    }

    public void result(int depth, int at) {
        if (depth == M) { // depth와 M이 같은 경우
            // 순서7
            for (int val : number) { // number[n]의 값을 뽑아서
                // 순서 8 number[M]의 값 1, 2
                sb.append(val+" "); // Sb에 저장하고
            }
            sb.append("\n"); // 다음 줄러 넘어감
            return; //순서 9 재귀 함수 종료
        }
        // m이 2인 경우
        for (int i = at; i <= N; i++) {  // at의 초기 값은 1 < N 까지 동작됨
            number[depth] = i; // number[depth] = i 값을 대입함
            // 순서 2(depth의 값 1) 순서 5(depth의 값 2)

            result(depth + 1, i + 1); // 동작시 재귀 함수가 실행됨
            // 순서 3 순서 6
        }
    }
}
