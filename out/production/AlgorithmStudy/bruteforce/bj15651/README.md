### 문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.


### 입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)

### 출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

### 예제
입력 : 3 1 <br>
출력 : 1 <br> 2 <br> 3

### 접근
재귀 함수를 이용하는 방식으로 접근
1. 함수를 생성하여 인자에 dapth를 받는다.
2. depth와 M 동일하면 값을 출력하고 함수를 종료한다.
3. list에 i+1 값을 담고 해당 재귀 함수를 호출하여 depth+1을 한다.