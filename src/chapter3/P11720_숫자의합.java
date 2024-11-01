package chapter3;

import java.util.Scanner;

public class P11720_숫자의합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();

        int sum = 0;

        for (char c : cNum) {
            sum += Character.getNumericValue(c);
        }

        System.out.println("sum : " + sum);
    }

}
