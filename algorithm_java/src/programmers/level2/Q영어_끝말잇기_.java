package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Q영어_끝말잇기_ {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] result = solution.solution(3, words);
        for (int T : result) {
            System.out.println(T);
        }
    }

    static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < words.length; i++) {
                String currWord = words[i];

                // 한 글자인 단어는 인정되지 않음
                if (currWord.length() == 1) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }

                // 이전에 등장한 단어인 경우
                if (map.containsKey(currWord) || (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != currWord.charAt(0))) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }

                map.put(currWord, 1);
            }

            return answer;
        }
    }
}