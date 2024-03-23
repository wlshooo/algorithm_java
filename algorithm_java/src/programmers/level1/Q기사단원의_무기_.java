package programmers.level1;

public class Q기사단원의_무기_ {
    public class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;

            for (int i = 1; i <= number; i++) {
                int divisorCount = countDivisors(i);

                if (divisorCount > limit) {
                    answer += power;
                } else {
                    answer += divisorCount;
                }
            }

            return answer;
        }

        // 약수 개수 계산 함수
        private int countDivisors(int n) {
            int count = 0;
            int sqrtN = (int) Math.sqrt(n);

            for (int j = 1; j <= sqrtN; j++) {
                if (n % j == 0) {
                    count += 2; // 두 개의 약수를 한 번에 계산
                    if (j == n / j) {
                        count--; // 중복 계산 방지
                    }
                }
            }

            return count;
        }
    }

}