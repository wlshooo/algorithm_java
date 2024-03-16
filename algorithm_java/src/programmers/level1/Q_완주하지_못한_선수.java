package programmers.level1;

import java.util.HashMap;

public class Q_완주하지_못한_선수 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (String player : participant) {
                hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
            }
            for (String player : completion) {
                hashMap.put(player, hashMap.get(player) - 1);
            }
            for (String key : hashMap.keySet()) {
                if (hashMap.get(key) != 0) {
                    answer = key;
                    System.out.println("answer = " + answer);
                    break;
                }
            }
            return answer;
        }
    }
}