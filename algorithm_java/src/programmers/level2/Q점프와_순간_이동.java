package programmers.level2;

public class Q점프와_순간_이동 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result  = solution.solution(5000);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int n) {
            int ans = 0;

            while (n > 0) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n= n-1;
                    ans++;
                }
            }

            return ans;
        }
    }
}