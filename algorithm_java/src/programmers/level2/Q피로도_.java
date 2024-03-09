package programmers.level2;

public class Q피로도_ {
    public static void main(String[] args) {
        int k= 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        Solution s = new Solution();
        int result = s.solution(k, dungeons);
        System.out.println(result);
    }

    static class Solution {
        static boolean[] visited;
        static int count =0;
        public int solution(int k, int[][] dungeons) {
            visited = new boolean[dungeons.length];
            dfs(0, k, dungeons);
            return count;
        }
        private void dfs(int depth, int fatigue, int[][] dungeons){
            for (int i = 0; i < dungeons.length; i++){
                if (visited[i] || dungeons[i][0] > fatigue) {
                    continue;
                }
                visited[i] = true;
                dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
                visited[i] = false;
            }
            count = Math.max(count, depth);
        }
    }
}
