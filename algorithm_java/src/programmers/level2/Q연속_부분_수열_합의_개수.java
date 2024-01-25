package programmers.level2;

import java.util.HashSet;

public class Q연속_부분_수열_합의_개수 {
    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        Solution s = new Solution();
        int result = s.solution(elements);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] elements) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < elements.length; i++) {
                for (int j = 1; j <= elements.length; j++) {
                    int sum = 0;
                    for (int k = i; k < j + i; k++) {
                        sum += elements[k % elements.length];
                    }
                    set.add(sum);
                }
            }

            return set.size();
            
//            (성능 개선)
//            HashSet<Integer> set = new HashSet<>();
//            int n = elements.length;
//
//            for (int i = 0; i < n; i++) {
//                int sum = 0;
//                for (int j = 0; j < n; j++) {
//                    sum += elements[(i + j) % n];
//                    set.add(sum);
//                }
//            }
//
//            return set.size();
        }
    }
}
