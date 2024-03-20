package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q개인정보_수집_유효시간 {
    class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            String answerTemp = "";
            Map<String, Integer> map = new HashMap<>();
            int integerDay = dayToInteger(today);
            for (int i = 0; i < terms.length; i++) {
                String[] split = terms[i].split(" ");
                map.put(split[0], Integer.parseInt(split[1]));
            }
            for (int i = 0; i < privacies.length; i++) {
                String[] privaciesSplit = privacies[i].split(" ");
                int T = dayToInteger(privaciesSplit[0]) + map.get(privaciesSplit[1]) * 28;
                if (integerDay >= T) {
                    answerTemp += (i + 1) + " ";
                }
            }
            int[] answer = Arrays.stream(answerTemp.split(" ")).mapToInt(Integer::parseInt).toArray();
            return answer;
        }

        private static int dayToInteger(String today) {
            String[] split = today.split("\\.");
            return Integer.parseInt(split[0]) * 12 * 28 + Integer.parseInt(split[1]) * 28 + Integer.parseInt(split[2]);
        }
    }
}