package programmers.level1;

public class Q가장_가까운_글자 {
    class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            String[] split = s.split("");
            for (int i = 0; i < answer.length; i++) {
                answer[i] = -1;
            }
            for (int i = 0; i < s.length(); i++) {
                int memIndex = Integer.MAX_VALUE;
                for (int j = 0; j < i; j++) {
                    if (split[i].equals(split[j])) {
                        memIndex = j;
                    }
                }
                if(memIndex!=Integer.MAX_VALUE) answer[i] =i-memIndex;
            }
            return answer;
        }
    }
}