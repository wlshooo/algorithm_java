package programmers.level2;

import java.util.Stack;

public class Q짝지어_제거하기_ {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution("baabaa");
        System.out.println(answer);
    }



    static class Solution {
        public int solution(String s) {
            // 스택을 초기화합니다.
            Stack<Character> stack = new Stack<>();

            // 문자열 s를 순회하면서 각 문자에 대해 처리합니다.
            for (char c : s.toCharArray()) {
                // 스택이 비어있지 않고, 스택의 맨 위 문자가 현재 문자와 같다면 스택에서 제거합니다.
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    // 그렇지 않으면 현재 문자를 스택에 추가합니다.
                    stack.push(c);
                }
            }

            // 스택이 비어있다면 짝지어 제거 가능한 문자열이므로 1을 반환합니다.
            if (stack.isEmpty()) {
                return 1;
            } else {
                // 스택이 비어있지 않다면 짝지어 제거 불가능한 문자열이므로 0을 반환합니다.
                return 0;
            }
        }
    }

}