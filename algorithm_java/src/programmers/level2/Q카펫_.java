package programmers.level2;

public class Q카펫_ {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(10, 2);
        for (int i : result) {
            System.out.println(i);
        }
    }
    static class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            int sum = brown + yellow;

            for (int i = 3; i < sum; i++) {
                int j = sum / i;

                if (sum % i == 0 && j >= 3) {
                    int col = Math.max(i, j);
                    int row = Math.min(i, j);
                    int center = (col - 2) * (row - 2);

                    if (center == yellow) {
                        answer[0] = col;
                        answer[1] = row;
                        return answer;
                    }
                }
            }
            return answer;
        }
    }
}