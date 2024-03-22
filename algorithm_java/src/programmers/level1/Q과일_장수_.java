package programmers.level1;

import java.util.Arrays;

public class Q과일_장수_ {
    class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            Arrays.sort(score);

            int min = Integer.MAX_VALUE;
            int count = 0;

            for (int i = score.length - 1; i >= 0; i--) {
                count++;
                min = Math.min(min, score[i]);

                if (count == m) {
                    answer += m * min;
                    count = 0;
                    min = Integer.MAX_VALUE; // 다음 상자를 위해 최소 점수 초기화
                }
            }

            return answer;
        }
    }
}