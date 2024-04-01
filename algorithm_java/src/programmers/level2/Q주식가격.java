package programmers.level2;


public class Q주식가격 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};
        Solution solution = new Solution();
        int[] solution1 = solution.solution(prices);
        for (int T : solution1) {
            System.out.println(T);
        }
    }
    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                int count = 0;
                int currentPrice = prices[i];
                for (int j = i+1; j < prices.length; j++) {
                    if (currentPrice <= prices[j]) {
                        count++;
                    } else {
                        count++;
                        break;
                    }
                }
                answer[i] = count;
            }

            return answer;
        }
    }
}
