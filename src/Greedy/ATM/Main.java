package Greedy.ATM;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        sc.nextLine();
        String[] time = sc.nextLine().split(" ");


        Integer[] timeList = Stream.of(time).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(timeList);

        int number = 0;
        int result = 0;

        for (int targer: timeList) {
            number += targer;
            result += number;
        }
        System.out.println(result);
    }
}
