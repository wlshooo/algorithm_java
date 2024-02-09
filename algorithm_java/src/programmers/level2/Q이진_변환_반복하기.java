package programmers.level2;

public class Q이진_변환_반복하기 {
    public static void main(String[] args) {
        String s = "1111111";
        Solution solution = new Solution();
        int[] result = solution.solution(s);
        for (int T : result) {
            System.out.println(T);
        }
    }

    static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[2];
            int removeCount = 0;
            int afterRemoveLength = s.length();
            int count = 0;
            while (afterRemoveLength != 1) {
                int rcount = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0') {
                        rcount++;
                    }
                }
                removeCount += rcount;
                afterRemoveLength = s.length() - rcount;
                s = Integer.toBinaryString(afterRemoveLength);
                count++;
            }
            answer[0] = count;
            answer[1] = removeCount;
            return answer;
        }
    }
}