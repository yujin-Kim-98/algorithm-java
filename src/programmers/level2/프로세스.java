package programmers.level2;

import java.util.*;

// 이것이 프린터큐
public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = { 2, 1, 3, 2 };
        int location = 2;

//        int[] priorities = { 1, 1, 9, 1, 1, 1 };
//        int location = 0;

        int result = new Solution().solution(priorities, location);

        System.out.println("result : " + result);
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
            pq.offer(priorities[i]);
        }

        int count = 0;

        while (!queue.isEmpty()) {
            int currentIdx = queue.poll();

            if (priorities[currentIdx] == pq.peek()) {
                count++;
                pq.poll();

                if (currentIdx == location) {
                    return count;
                }
            } else {
                queue.offer(currentIdx);
            }
        }

        return count;
    }
}
