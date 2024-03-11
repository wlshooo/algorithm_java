package programmers.level2;

public class Q_k진수에서_소수_개수_구하기_ {
    public static void main(String[] args) {
        int n = 110011;
        int k = 10;
        Solution s = new Solution();
        int result = s.solution(n, k);
        System.out.println(result);
    }
    static class Solution {

        public int solution(int n, int k) {
            int count = 0;
            long num = convertNum(n, k);
            String[] split = String.valueOf(num).split("0");

            for (String s : split) {
                if (!s.isEmpty() && isPrime(Long.parseLong(s))) {
                    count++;
                }
            }

            return count;
        }

        private static long convertNum(int n, int k) {
            StringBuilder result = new StringBuilder();
            while (n >= k) {
                result.insert(0, n % k);
                n = n / k;
            }
            if (n != 0) {
                result.insert(0, n);
            }
            return Long.parseLong(result.toString());
        }

        private static boolean isPrime(long a) {
            if (a < 2) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
