package Greedy.SugarDelivery;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
            1. N킬로그램의 배달을 정확하게 해야함
            2. 설탕은 3kg, 5kg 봉지가 있음
            3. 최대한 적은 수의 봉지를 사용함
            4. 정확하게 N개를 만들 수 없다면 -1 반환
         */
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = bagList(N);
        System.out.println(result);

    }

    public static int bagList(int kg) {
        List<Integer> bagKind = Arrays.asList(5, 3);
        int value = 0;

        if(kg%bagKind.get(0) == 0){
            return value = kg/bagKind.get(0);
        }
        while (!(kg % bagKind.get(0) == 0)) {
            kg -= bagKind.get(1);
            value++;

            if (kg % bagKind.get(0) == 0) {
                value += kg / bagKind.get(0);
                break;
            } else if (kg < 5 && kg % 3 != 0) {
                value = -1;
                break;
            }
        }
        return value;
    }

}