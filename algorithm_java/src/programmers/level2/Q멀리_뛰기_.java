package programmers.level2;

// https://zzang9ha.tistory.com/138
public class Q멀리_뛰기_ {
    public static void main(String[] args) {
        Solution s = new Solution();
        long result = s.solution(4);
        System.out.println(result);
    }

    static class Solution {
        public long solution(int n) {
            int[] dp = new int[2001];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i < 2001; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
            }
            return dp[n];
        }
    }
}