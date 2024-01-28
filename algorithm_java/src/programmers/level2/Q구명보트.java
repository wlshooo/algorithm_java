package programmers.level2;

import java.util.Arrays;


public class Q구명보트 {
    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int limit = 100;
        Solution solution = new Solution();
        int re = solution.solution(people, limit);
        System.out.println(re);

    }
    static class Solution {
        public int solution(int[] people, int limit) {
            Arrays.sort(people);

            int answer = 0;
            int left = 0;
            int right = people.length - 1;

            while (left <= right) {
                if (people[left] + people[right] <= limit) {
                    left++;
                }
                right--;
                answer++;
            }

            return answer;
        }
    }
}