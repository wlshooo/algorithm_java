package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q명예의_전당_1 {
    class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < score.length; i++) {
                if (list.size() < k) {
                    list.add(score[i]);
                    Collections.sort(list);
                    answer[i] = list.get(0);
                } else {
                    int min = list.get(0);
                    if (min <= score[i]) {
                        list.remove(0);
                        list.add(score[i]);
                        Collections.sort(list);
                        answer[i] = list.get(0);
                    } else {
                        answer[i] = list.get(0);
                    }
                }
            }
            return answer;
        }
    }
}