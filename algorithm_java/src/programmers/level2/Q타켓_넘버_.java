package programmers.level2;

public class Q타켓_넘버_ {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        Solution s = new Solution();
        int result = s.solution(numbers, target);
        System.out.println(result);
    }

    static class Solution {
        int count = 0;
        public int solution(int[] numbers, int target) {
            dfs(0,target,numbers,0);
            return count;
        }

        private void dfs(int depth, int target, int[] numbers, int sum) {
            if (depth == numbers.length) {
                if (sum == target) {
                    count++;
                }
            } else {
                dfs(depth + 1, target,numbers,sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
                dfs(depth + 1, target,numbers,sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
            }

        }
    }
}
