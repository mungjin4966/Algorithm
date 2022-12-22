### 백준 1037번 문제
양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

### 입력
첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.

### 출력
첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다.

### 예시
입력 값 : 

2
<br>
4 2

결과 값 : 8 


### 예시2
입력 값 : 

1

2

결과 값 : 4

### 문제 해석
1. 약수를 구하는 프로그램
- 조건 첫 번째 입력값 n은 약수의 개수를 의미함
- 2번째 조건은 N의 진짜 약수가 주어짐

2. 조건
- N의 진짜 약수를 구하는 것으로 1,N은 약수에 포함하지 않음

---
### 접근 
양수 X를 구하고자 하는 경우 가장 작은 X의 값을 min이라고 한다면 MAX = x/min과 같다.

즉 MAX = x*min와 같으며 이것은 x = min*max와 같다.
