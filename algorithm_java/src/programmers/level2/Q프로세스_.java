package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Q프로세스_ {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        Solution s = new Solution();
        int result = s.solution(priorities, location);
        System.out.println(result);
    }

    static class Solution {
        static Queue<Integer> queue;
        static int currentLocation;

        public int solution(int[] priorities, int location) {
            currentLocation = location;
            queue = new LinkedList<>();
            int answer = 0;
            for (int priority : priorities) {
                queue.add(priority);
            }

            while (!queue.isEmpty()) {
                int max = 0;
                for (int i : queue) {
                    max = Math.max(max, i);
                }
                if (queue.peek() < max) {
                    Integer poll = queue.remove();
                    queue.add(poll);
                    currentLocation -= 1;
                    if (currentLocation < 0) {
                        currentLocation = queue.size() - 1;
                    }
                } else {
                    int peek = queue.peek();
                    answer++;
                    if (currentLocation == 0 && peek == priorities[location]) {
                        break;
                    } else {
                        queue.remove();
                        currentLocation -= 1;
                        if (currentLocation < 0) {
                            currentLocation = queue.size() - 1;
                        }
                    }
                }

            }
            return answer;
        }
    }
}
