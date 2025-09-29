package programmers.level2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class 영어끝말잇기 {
    public static void main(String[] args) {
//        int n = 3;
//        String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };

//        int n = 5;
//        String[] words = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
//
        int n = 2;
        String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };

        int[] result = new Solution().solution(n, words);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> wordSet = new HashSet<>(Collections.singletonList(words[0]));
        char prevChar = words[0].charAt(words[0].length() - 1);

        for (int i = 1; i < words.length; i++) {
            if (prevChar != words[i].charAt(0) || wordSet.contains(words[i])) {
                return new int[] { (i % n) + 1, (i / n) + 1 };
            }
            prevChar = words[i].charAt(words[i].length() - 1);;
            wordSet.add(words[i]);
        }

        return new int[] { 0, 0 };
    }
}
