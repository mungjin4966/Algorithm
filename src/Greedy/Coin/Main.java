package Greedy.Coin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int coinLength = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int[] coinKind = new int[coinLength];

        for (int i = 0; i <= coinLength - 1; i++) {
            coinKind[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;

        for (int i = coinKind.length; i > 0; i--) {
            result += price / coinKind[i - 1];
            price %= coinKind[i - 1];
        }

        System.out.println(result);
    }
}
