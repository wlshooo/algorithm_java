package programmers.level2;

import java.util.Stack;

public class Q괄호_회전하기 {
    public static void main(String[] args) {
        String s = "{(})";
        Solution str = new Solution();
        int result = str.solution(s);
        System.out.println(result);
    }

    static class Solution {
        public int solution(String s) {
            int answer = 0;
            answer += cal(s);
            for (int i = 0; i < s.length() - 1; i++) {
                s = s.substring(1) + s.charAt(0);
                answer += cal(s);
            }

            return answer;
        }

        private static int cal(String s) {

            if (s.length() % 2 == 1) return 0;
            int[] bracket = new int[3];

            if (s.charAt(0) == '(') bracket[0]++;
            if (s.charAt(0) == '{') bracket[1]++;
            if (s.charAt(0) == '[') bracket[2]++;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == '(') bracket[0]++;
                if (s.charAt(i) == '{') bracket[1]++;
                if (s.charAt(i) == '[') bracket[2]++;
                if (s.charAt(i) == ')') {
                    if (s.charAt(i - 1) == '{' || s.charAt(i - 1) == '[') return 0;
                    bracket[0]--;
                    if (bracket[0] < 0) return 0;
                }

                if (s.charAt(i) == '}') {
                    if (s.charAt(i - 1) == '(' || s.charAt(i - 1) == '[') return 0;
                    bracket[1]--;
                    if (bracket[1] < 0) return 0;
                }
                if (s.charAt(i) == ']') {
                    if (s.charAt(i - 1) == '{' || s.charAt(i - 1) == '(') return 0;
                    bracket[2]--;
                    if (bracket[2] < 0) return 0;
                }

            }
            if (bracket[0] == 0 && bracket[1] == 0 && bracket[2] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
