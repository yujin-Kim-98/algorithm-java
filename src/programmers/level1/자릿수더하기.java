package programmers.level1;

public class 자릿수더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        int N = 123;
        int N = 987;

        int result = solution.solution(N);
        System.out.println(result);
    }
}

class Solution {
    public int solution(int n) {
        return String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();

//        for (char c : String.valueOf(n).toCharArray()) {
//            result += Character.getNumericValue(c);
//        }
//        return result;
    }
}
