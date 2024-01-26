package programmers.level2;

public class QJadenCase_문자열_만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "  for the what 1what  ";
        System.out.println(s);
        String solution1 = solution.solution(s);
        System.out.println(solution1);
    }

    static class Solution {
        public String solution(String s) {
            String answer = "";
            s = s.toLowerCase();
            String[] split = s.split("");
            boolean isCheck = false;
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals(" ")) {
                    answer += split[i];
                    isCheck = false;
                } else {
                    if (!isCheck) {
                        answer += split[i].toUpperCase();
                        isCheck = true;
                    } else {
                        answer += split[i];
                    }
                }
            }
            return answer;
        }
    }
}