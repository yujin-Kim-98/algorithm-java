package programmers.level2;

import java.util.Arrays;

public class 전화번호목록 {

    public static void main(String[] args) {
//        String[] phone_book = { "119", "97674223", "1195524421" };
//        String[] phone_book = { "123","456","789" };
        String[] phone_book = { "12","123","1235","567","88" };

        boolean result = new Solution().solution(phone_book);
        System.out.println("result : " + result);
    }

}

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}
