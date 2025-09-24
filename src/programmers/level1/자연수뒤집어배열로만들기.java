package programmers.level1;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        int n = 12345;

        int[] result = new Solution().solution(n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Solution {
    public int[] solution(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
