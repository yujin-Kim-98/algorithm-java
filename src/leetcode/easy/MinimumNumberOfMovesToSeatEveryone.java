package leetcode.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

// 2037. Minimum Number of Moves to Seat Everyone
public class MinimumNumberOfMovesToSeatEveryone {

    public static void main(String[] args) {
//        int[] seats = new int[] { 3, 1, 5 };
//        int[] students = new int[] { 2, 7, 4 };

//        int[] seats = new int[] { 4, 1, 5, 9 };
//        int[] students = new int[] { 1, 3, 2, 6 };

        int[] seats = new int[] { 2, 2, 6, 6 };
        int[] students = new int[] { 1, 3, 2, 6 };

        int result = new Solution().minMovesToSeat(seats, students);

        System.out.println("result : " + result);
    }

}

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int result = 0;

        for (int i = 0; i < students.length; i++) {
            result += Math.abs(students[i] - seats[i]);
        }

        return result;
    }

    // Stream 이용
    public int minMovesToSeat2(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        return IntStream.range(0, students.length)
                .map(i -> Math.abs(students[i] - seats[i]))
                .sum();
    }
}
