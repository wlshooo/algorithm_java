package programmers.level1;

import java.util.Arrays;

public class Q문자열_내_마음대로_정렬하기_ {
    class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = new String[strings.length];

            for (int i=0; i<strings.length; i++)
                answer[i] = strings[i].charAt(n) + strings[i];

            Arrays.sort(answer);

            for (int i=0; i<answer.length; i++)
                answer[i] = answer[i].substring(1);

            return answer;
        }
    }
}