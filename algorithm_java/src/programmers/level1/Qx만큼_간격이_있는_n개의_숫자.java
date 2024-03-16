package programmers.level1;

public class Qx만큼_간격이_있는_n개의_숫자 {
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            for(int i=1; i<=n; i++)
            {
                answer[i-1] = x*(long)i;
            }
            return answer;
        }
    }
}