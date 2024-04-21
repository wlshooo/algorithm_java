package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class Q문자열_내림차순으로_배치하기 {
    class Solution {
        public String solution(String s) {
            String answer ="";
            String[] split = s.split("");
            Arrays.sort(split, Collections.reverseOrder());
            for (String string : split) {
                System.out.println(string);
            }
            for (String string : split) {
                answer+=string;
            }
            return answer;
        }
    }
}