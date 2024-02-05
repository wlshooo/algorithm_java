package programmers.level2;

public class Q숫자의_표현 {
    public static void main(String[] args) {

        int n = 15;
        Solution solution = new Solution();
        int answer = solution.solution(n);
        System.out.println(answer);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                int sum = 0;
                for (int j = i; j <= n; j++) {
                    sum+=j;
                    if (sum == n) {
                        answer++;
                        break;
                    }
                    else if (sum > n) {
                        break;
                    }

                }

            }
            return answer;
        }
    }
}