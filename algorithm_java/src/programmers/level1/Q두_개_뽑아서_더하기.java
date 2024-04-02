package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Q두_개_뽑아서_더하기 {
    class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if(i==j) continue;
                    set.add(numbers[i]+ numbers[j]);
                }
            }

            Object[] setArray = set.toArray();
            int[] answer = new int[setArray.length];
            for (int i = 0; i < setArray.length; i++) {
                answer[i] = (int)setArray[i];
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}