package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class P1546_평균 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int scores[] = new int[count];

        for (int i = 0; i < count; i++) {
            scores[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            sum += scores[i];
        }

        System.out.println(sum * 100.0 / max / count);
    }

}
