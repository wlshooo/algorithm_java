package programmers.level2;

import java.util.PriorityQueue;

public class Q더_맵게 {
    public static void main(String[] args) {
        int[] scoville = {3,9,1,2,10,12};
        int K = 7;
        Solution s = new Solution();
        int result = s.solution(scoville, K);
        System.out.println(result);
    }
    static class Solution {
        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int s : scoville) {
                pq.offer(s);
            }

            int answer = 0;
            while (pq.size() > 1 && pq.peek() < K) {
                int first = pq.poll();
                int second = pq.poll();
                int newScoville = first + (second * 2);
                pq.offer(newScoville);
                answer++;
            }

            if (pq.peek() < K) {
                return -1;
            }

            return answer;
        }

    }
}
