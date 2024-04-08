package programmers.level2;

import java.util.Stack;

public class Q택배상자_ {
    public static void main(String[] args) {
        int[] order = {1, 3, 2, 5, 4};
        Solution solution = new Solution();
        int result = solution.solution(order);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] order) {
            int[] priority = new int[order.length];

            for (int i = 0; i < order.length; i++) {
                priority[order[i] - 1] = i;
            }

            for (int T : priority) {
                System.out.println(T);
            }
            Stack<Integer> stack = new Stack<>();

            int target = 0;

            for (int i = 0; i < priority.length; i++) {
                if (priority[i] == target) {
                    target++;
                } else {
                    stack.push(priority[i]);
                }
                while (!stack.isEmpty() && stack.peek() == target) {
                    stack.pop();
                    target++;
                }
            }
            return target;
        }
    }
}