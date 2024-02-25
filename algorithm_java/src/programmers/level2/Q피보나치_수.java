package programmers.level2;

public class Q피보나치_수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution(3);
        System.out.println(answer);
    }
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int[] arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i-2]%1234567 + arr[i-1]%1234567;
            }
            answer = arr[n];
            return answer%1234567;
        }
    }
}