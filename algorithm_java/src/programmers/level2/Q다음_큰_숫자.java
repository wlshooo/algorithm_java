package programmers.level2;

public class Q다음_큰_숫자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution(15);
        System.out.println(answer);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int nCount = 0;
            nCount = getCount(n);

            System.out.println(nCount);
            while (true) {
                n++;
                int count = getCount(n);
                if (nCount == count) {
                    answer = n;
                    break;
                }
            }
            return answer;
        }
    }

    private static int getCount(int n) {
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') count++;
        }
        return count;
    }
}