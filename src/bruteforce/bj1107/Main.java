package bruteforce.bj1107;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] broken;
    public static void main(String[] agrs) throws IOException {  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        broken = new boolean[10];

        if (M != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                int num = Integer.parseInt(st.nextToken());
                broken[num] = true;
            }
        }

        int min_cnt = Math.abs(N - 100);    // +,- 로만 누르는 경우
        for (int i = 0; i <= 1000000; i++) {
            int len = check(i);   // 숫자버튼 누르는 횟수
            if (len > 0) {
                int press = Math.abs(N - i);  // +,- 버튼 누르는 횟수
                min_cnt = Math.min(min_cnt, len + press);   // 최소 이동 횟수 계산
            }
        }

        bw.write(min_cnt + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    static int check(int n) {
        if (n == 0) {
            if (broken[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        int len = 0;
        while (n > 0) {
            if (broken[n % 10]) {   // 고장난 버튼이 있는 경우
                return 0;
            }
            n /= 10;
            len += 1;   // 숫자버튼 누르는 횟수 증가
        }
        return len;
    }
//        int live = 100;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String n = br.readLine();
//        char[] target = n.toCharArray();
//
//        int broken = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int brokenNums[] = new int[broken];
//
//        for (int i = 0; i < broken; i++) {
//            brokenNums[i] = Integer.parseInt(st.nextToken());
//        }
//
//        boolean remocon[] = new boolean[10];
//        Arrays.fill(remocon, true);
//
//        for (int i = 0; i < remocon.length; i++) {
//            for (int j = 0; j < brokenNums.length; j++) {
//                if (i == brokenNums[j]) {
//                    remocon[i] = false;
//                }
//            }
//        }
//
//        int cnt = 0;
//        String value = "";
//
//        if (live == Integer.parseInt(n)) {
//            System.out.println(cnt);
//        }
//
//        for (int i = 0; i < target.length; i++) {
//            for (int l = 0; l < remocon.length; l++) {
//                if (Integer.parseInt(String.valueOf(target[i])) == l && remocon[l]) {
//                    cnt++;
//                    value += String.valueOf(l);
//                }
//                if (Integer.parseInt(String.valueOf(target[i])) == l && !remocon[l]) {
//                    for (int j = l; j <= 9; j++) {
//                        if (remocon[j]) {
//                            cnt++;
//                            value += String.valueOf(j);
//                            break;
//                        }
//                    }
//                }
//            }
//            System.out.println("value "+ value);
//        }
//
//        int result = Integer.parseInt(value);
//
//        while (true){
//            if(Integer.parseInt(n) == result){
//                break;
//            }
//            else{
//                cnt++;
//                if(result > Integer.parseInt(n)){
//                    result--;
//                }else{
//                    result++;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
}
