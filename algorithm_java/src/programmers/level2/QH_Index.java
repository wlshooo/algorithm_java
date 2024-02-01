package programmers.level2;

import java.util.Arrays;

public class QH_Index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        Solution s = new Solution();
        int result = s.solution(citations);
        System.out.println(result);
    }
    static class Solution {
        public int solution(int[] citations) {
            int answer = 0;

            Arrays.sort(citations);

            for(int i = 0; i < citations.length; i++) {
                int h = citations.length - i; // 인용된 논문의 수

                if(citations[i] >= h) {
                    answer = h;
                    break;
                }
            }

            return answer;
        }
    }
}
