package leetcode.easy;

import java.util.Arrays;

// 977. Squares of a Sorted Array
public class SquaresOfASortedArray {

    public static void main(String[] args) {
//        int[] nums = { -4, -1, 0, 3, 10 };
        int[] nums = { -7, -3, 2, 3, 11 };

        int[] result = new Solution().sortedSquares(nums);
        System.out.println("break point");
    }

}

class Solution {
    // O(n)
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        while (left <= right) {
            int leftValue = nums[left];
            int rightValue = nums[right];

            int leftSquare = leftValue * leftValue;
            int rightSquare = rightValue * rightValue;

            if (leftSquare >= rightSquare) {
                res[idx--] = leftSquare;
                left++;
            } else {
                res[idx--] = rightSquare;
                right--;
            }
        }

        return res;
    }

    // O(n log n)
    public int[] sortedSquares2(int[] nums) {
        return Arrays.stream(nums)
                .map(Math::abs)
                .sorted()
                .map(i -> i * i)
                .toArray();
    }
}
