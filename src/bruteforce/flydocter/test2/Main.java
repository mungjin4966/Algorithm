package bruteforce.flydocter.test2;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] p = {{1,3}, {3,1}, {3,5}, {2,5}, {5,3}};

       int value = solution.solution(p);
        System.out.println(value);
    }
}
