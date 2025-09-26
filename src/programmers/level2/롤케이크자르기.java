package programmers.level2;

import java.util.*;

public class 롤케이크자르기 {
    public static void main(String[] args) {
        int[] toppings = { 1, 2, 1, 3, 1, 4, 1, 2 };
//        int[] toppings = { 1, 2, 3, 1, 4 };

        Solution solution = new Solution();
        int result = solution.solution(toppings);

        System.out.println("result : " + result);
    }
}

class Solution {
    public int solution(int[] topping) {
        int count = 0;

        Map<Integer, Integer> right = new HashMap<>();
        for (int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }

        Set<Integer> left = new HashSet<>();
        for (int i = 0; i < topping.length - 1; i++) {
            left.add(topping[i]);

            right.put(topping[i], right.get(topping[i]) - 1);
            if (right.get(topping[i]) == 0) {
                right.remove(topping[i]);
            }

            if (left.size() == right.size()) {
                count++;
            }
        }

        return count;
    }
}
