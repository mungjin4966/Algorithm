package bruteforce.bj14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M, ans;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static int map[][];

    public static void main(String[] agrs) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 맵 크기 입력받음
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 5가지의 도형중 공통적으로 4가지는 DFS의 방식으로 탐색을 하여도 값을 도출할 수 있기 때문에 1자리씩 찾아가면서 값으 찾음
        // 또한 백트래킹으로 지나온 자리를 다시한번 거치는 방식을 이용하여 최대값을 도출함
        boolean[][] visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visit[i][j] = true;
                dfs(i,j,1,map[i][j], visit);
                visit[i][j] = false;
                check(i,j);
            }
        }

        System.out.println(ans);
    }


    static void dfs(int y, int x, int cnt, int sum, boolean[][] visit){
        if(cnt >= 4 ){
            ans = Math.max(ans,sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny<0 || nx<0 || ny >= N || nx >= M || visit[ny][nx]){
                continue;
            }
            visit[ny][nx] = true;
            dfs(ny, nx, cnt+1, sum+map[ny][nx], visit);
            visit[ny][nx] = false;
        }
    }

    // ㅗ 모양의 도형은 DFS 방식으로 탐색할 수 없기 때문에 다음과 같이 도형을 직접 대입하면서 최대 값을 찾아감
    static void check(int y, int x){
        if( y < N-2 && x<M-1){
            ans = Math.max(ans, map[y][x] + map[y+1][x] + map[y+2][x] + map[y+1][x+1]);
        }
        if(y < N-2 && x>0){
            ans = Math.max(ans, map[y][x] + map[y+1][x] + map[y+2][x] + map[y+1][x-1]);
        }
        if(y < N - 1 && x < M-2){
            ans = Math.max(ans, map[y][x] + map[y][x+1] + map[y][x+2] + map[y+1][x+1]);
        }
        if(y > 0 && x < M-2){
            ans = Math.max(ans, map[y][x] + map[y][x+1] + map[y][x+2] + map[y-1][x+1]);
        }
    }
}
