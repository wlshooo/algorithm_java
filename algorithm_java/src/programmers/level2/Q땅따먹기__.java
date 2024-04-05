package programmers.level2;

public class Q땅따먹기__ {
    public static void main(String[] args) {

        int[][] land = {
                {6, 7, 1, 2}, {2, 3, 10, 8}, {1, 3, 9, 4}, {7, 11, 4, 9}
        };

        Solution solution = new Solution();
        int result = solution.solution(land);
        System.out.println(result);
    }

    static class Solution {
        int solution(int[][] land) {
            int answer = 0;
            for (int i = 1; i < land.length; i++) {
                land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
                land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
                land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
                land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
            }

            for (int i = 0; i < 4; i++) {
                answer = Math.max(answer,land[land.length-1][i]);
            }
            return answer;
        }
    }
}
