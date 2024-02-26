package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Q의상 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        int result = solution.solution(clothes);
        System.out.println(result);
    }


    static class Solution {
        public int solution(String[][] clothes) {
            Map<String, Integer> map = new HashMap<>();
            int answer = 1;
            for (int i = 0; i < clothes.length; i++) {
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
            }

            for (String s : map.keySet()) {
                answer *= map.get(s)+1;
            }

            answer-=1;
            return answer;
        }
    }
}
