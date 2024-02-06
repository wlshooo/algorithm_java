package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Q1차_캐시 {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        Solution s = new Solution();
        int result = s.solution(cacheSize, cities);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;
            Queue<String> queue = new LinkedList<>();
            if (cacheSize == 0) {
                return cities.length * 5;
            }
            for (int i = 0; i < cities.length; i++) {
                String city = cities[i].toLowerCase();
                if (queue.contains(city.toLowerCase())) {
                    queue.remove(city.toLowerCase());
                    queue.add(city.toLowerCase());
                    answer += 1;
                    continue;
                } else {
                    answer += 5;
                }
                if (queue.size() < cacheSize) {
                    queue.add(city.toLowerCase());
                } else {
                    queue.remove();
                    queue.add(city.toLowerCase());
                }
            }
            return answer;
        }
    }
}
