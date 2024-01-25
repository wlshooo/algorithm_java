package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q귤_고르기_ {
    public static void main(String[] args) {
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int k = 6;
        Solution s = new Solution();
        int result = s.solution(k, tangerine);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < tangerine.length; i++) {
                map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
            }
            List<Integer> list = new ArrayList<>(map.keySet());
            list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));


            for (Integer i : list) {
                answer++;
                k -= map.get(i);
                if (k <= 0) {
                    break;
                }
            }
            return answer;
        }
    }
}
