package programmers.level2;

import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q롤케이크_자르기 {
    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        Solution solution = new Solution();
        int result = solution.solution(topping);
        System.out.println(result);
    }
    static class Solution {
        public int solution(int[] topping) {
            int answer = 0;
            Set<Integer> leftSet = new HashSet<>();
            Set<Integer> rightSet = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();

            if(topping.length <= 2) return topping.length - 1;

            leftSet.add(topping[0]);

            // 각 토핑별 등장 횟수 저장
            int[] toppingCount = new int[100001];
            toppingCount[topping[0]]++;

            for (int i = 1; i < topping.length; i++) {
                rightSet.add(topping[i]);
                queue.add(topping[i]);
                toppingCount[topping[i]]++;
            }

            for (int j = 0; j < topping.length - 1; j++) {
                int removeQueue = queue.remove();
                toppingCount[removeQueue]--;
                if (toppingCount[removeQueue] == 0) {
                    rightSet.remove(removeQueue);
                }
                leftSet.add(removeQueue);

                if (leftSet.size() == rightSet.size()) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
