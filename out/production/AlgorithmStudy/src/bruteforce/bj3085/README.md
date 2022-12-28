### 문제
상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다.

가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다. 상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다. 이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.

사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.

### 입력
첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)

다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.

사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.


### 출력
첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.

### 예시
입력 : <br>
3 <br>
CCP <br>
CCP <br>
PPC <br>
출력 :  <br>
3


### 문제 풀이
1. N*N크기에 사탕을 채운다.
2. 사탕의 색이 다른 인접한 두 칸을 고른다.
3. 모두 같은 색으로 이루어진 긴 부분(행, 열)을 고르고 사탕을 모두 먹는다.
4. 이때 상근이가 먹을 수 있는 사탕의 개수를 구한다.

### 접근
1. 첫줄에 보드의 크기가 정해진다.
2. 입력된 값을 보드에 채워 넣는다.
3. 색이다른 두 칸이 존재하는 인접한 두 칸의 값을 교환한다. 
4. 이때 같은 색으로 이루어진 가장 긴 행 또는 열이 있으면 해당 줄의 사탕을 모두 먹는다.

### 내가 접근한 코드
문제점 <br>
다음값과 일치하지 않으면 그다음 값과 무조건 교환을 하게 됨<br>
결국 일치하지 않는 모든 값을 변경하는 문제가 발생됨
<pre>
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] bomboni = new char[N][N];
        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                bomboni[i][j] = line.charAt(j);
            }
        }

        char temp;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    if (bomboni[i][j] != bomboni[i][j + 1]) {
                        if(j+2 >= N){
                            if(i+1 < N){
                                temp = bomboni[i][j + 1];
                                bomboni[i][j + 1] = bomboni[i + 1][j + 1];
                                bomboni[i + 1][j + 1] = temp;
                            }
                        }else{
                            temp = bomboni[i][j + 1];
                            bomboni[i][j + 1] = bomboni[i][j + 2];
                            bomboni[i][j + 2] = temp;
                        }

                    }
                }
            }
        }
        int[] row = new int[N];
        int[] column = new int[N];
</pre>

### 구글 참고 블로그
접근법 <br>
두 칸을 교환하는 부분과 긴연속 값을 찾는 부분으로 나뉜다. <br>
2중 for문을 돌면서 행으로 비교해보고 열로 비교해봐야 한다. <br>
가장 오른쪽 칸과 가장 아래칸은 교환할 수 없으니 인덱스 범위체크하는 로직이 들어가야 한다.

교환할 때마다 search()함수를 통해서 탐색을 진행한다. <br>
열 교환, 열 탐색시 i, j값을 신경써야 한다.

<pre>
 public int candy() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        board = new char[num][num];

        String line = "";
        // 입력 값을 배열에 넣어줌
        for (int i = 0; i < num; i++) {
            line = br.readLine();
            board[i] = line.toCharArray();
        }

        //
        // 행
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                char swap = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = swap;

                // max값 찾으러
                search();

                // 원상 복구
                swap = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = swap;
            }
        }

        // 열
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                
                char swap = board[j][i];
                board[j][i] = board[j + 1][i];
                board[j + 1][i] = swap;
                
                // 검색되는 값중 큰 값을 찾아서 반환한다.
                max = Math.max(search(), max);
                
                // 원상 복구
                swap = board[j][i];
                board[j][i] = board[j + 1][i];
                board[j + 1][i] = swap;
            }
        }


        System.out.println(max);

        return 0;
    }

    private static int search() {
        // 가로에서 중복되는 값이 잇는 경우 cnt를 증가시킴 없는 경우 cnt를 1로 초기화
        for (int i = 0; i < num; i++) {
            int cnt = 1;
            for (int j = 0; j < num - 1; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }

        // 세로에서 중복되는 값이 잇는 경우 cnt를 증가시킴 없는 경우 cnt를 1로 초기화
        for (int i = 0; i < num; i++) {
            int cnt = 1;
            for (int j = 0; j < num - 1; j++) {
                if (board[j][i] == board[j + 1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }

        return max;
    }
</pre>


### 회고
나의 경우 세로와 가로를 한번에 검사해야 한다고 생각을 하였다. <br>
그러나 조건은 가로 세로를 검사하면 되는 것으로 꼭 한번에 검사를 할 필요가 없었다.<br>
결국 가로 검사, 세로 검사 후 중복되는 값 중 큰 값을 반환하는 방식으로 접근하면 된다.

