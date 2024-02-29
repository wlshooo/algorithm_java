package programmers.level2;

import java.util.Stack;

public class Q기능개발__ {
    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {

            Stack<Integer> stack = new Stack<>();
            int[] arr = new int[progresses.length];
            for (int i = 0; i < arr.length; i++) {
                int number = 100 - progresses[i];

                if (number % speeds[i] == 0) {
                    arr[i] = number / speeds[i];
                } else {
                    arr[i] = number / speeds[i] + 1;
                }
            }

            int count = 0;
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    if (max <= arr[i]) {
                        stack.push(count);
                        stack.push(1);
                    } else {
                        count++;
                        stack.push(count);
                    }
                } else {
                    if (arr[i] <= max) {
                        count++;
                    } else {
                        stack.push(count);
                        count=1;
                        max =arr[i];
                    }
                }
            }

            int[] answer = new int[stack.size()];
            for (int i = stack.size() - 1; i >= 0; i--) {
                answer[i] = stack.pop();
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        Solution s = new Solution();
        int[] solution = s.solution(progresses, speeds);
        for (int T : solution) {
            System.out.println(T);
        }
    }
}
