package bruteforce.bj14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj14500 {
    static int N,M, ans;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static int map[][];
    public int tetris() throws IOException {
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

        boolean[][] visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visit[i][j] = true;
                dfs(i,j,1,map[i][j], visit);
                visit[i][j] = false;
                check(i,j);
            }
        }


        return ans;
    }

    public void dfs(int y, int x, int cnt, int sum, boolean[][] visit){
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
