package bruteforce.bj1107;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] broken;
    public static void main(String[] agrs) throws IOException {  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사용자 입력받음
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // N의 값을 넣음
        int N = Integer.parseInt(br.readLine());
        // M의 값을 넣음
        int M = Integer.parseInt(br.readLine());
        // 리모콘 배열을 생성함
        broken = new boolean[10];

        if (M != 0) {// 고장난 버튼이 있는 경우
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) { // 고장난 버튼이 있는 만큼 받음
                int num = Integer.parseInt(st.nextToken());
                broken[num] = true; // 고장난 버튼을 입력함
            }
        }

        // +,- 버튼으로 이동했을 경우 나오는 값
        int min_cnt = Math.abs(N - 100);
        for (int i = 0; i <= 1000000; i++) { // 모든 경우의 수를 생각해서 1000000 만큼의 반복을 돌림
            int len = check(i);   // 숫자버튼 누르는 횟수
            if (len > 0) { // 숫자를 누르는 횟수가 0보다 큰 경우
                int press = Math.abs(N - i);  // +,- 버튼 누르는 횟수
                // 여기서 최소값이 현재 값보다 작은게 있다면 대입됨
                min_cnt = Math.min(min_cnt, len + press);   // 최소 이동 횟수 계산
            }
        }

        bw.write(min_cnt + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    static int check(int n) {
        // N의 값이 0인경우
        if (n == 0) {
            //0번째 값이 고장난 경우
            if (broken[0]) {
                return 0; // 값을 못누름
            } else {
                return 1; // 고장나지 않은 경우 0을 누름
            }
        }

        int len = 0;
        // N이 0보다 큰경우 반복함
        // 버튼으로 입력하는 경우 이동되는 값을 확인함
        while (n > 0) {
            // N%10의 값이 고장난 경우 못누름
            if (broken[n % 10]) {
                return 0;
            }
            // N의 값이 고장나지 않은 경우
            // 100 / 10 = 10
            n /= 10;
            len += 1;   // 숫자버튼 누르는 횟수 증가
        }
        return len;
    }

    /*
    * 내가 작성한 코드
    * */
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
