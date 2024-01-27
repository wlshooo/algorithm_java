package programmers.level2;

public class QN개의_최소공배수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 6, 8, 14};
        int result = solution.solution(arr);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] arr) {
            int answer = 0;

            if (arr.length == 1) return arr[0];

            int g = gcd(arr[0], arr[1]);
            answer = (arr[0] * arr[1]) / g;

            if (arr.length > 2) {
                for (int i = 2; i < arr.length; i++) {
                    g = gcd(answer, arr[i]);
                    answer = (answer * arr[i]) / g;
                }
            }
            return answer;
        }

        private static int gcd(int a, int b) {
            int r = a % b;
            if (r == 0) return b;
            else return gcd(b, r);
        }
    }
}