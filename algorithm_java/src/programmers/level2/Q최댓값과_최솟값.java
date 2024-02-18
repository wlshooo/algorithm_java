package programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Q최댓값과_최솟값 {
    class Solution {
        public String solution(String s) {
            String answer = "";

            int[] s1 = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(s1);
            answer+=s1[0]+" "+s1[s1.length-1];
            return answer;
        }
    }
}