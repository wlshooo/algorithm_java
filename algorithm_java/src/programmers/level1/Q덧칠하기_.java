package programmers.level1;

public class Q덧칠하기_ {
    class Solution {
        public int solution(int n, int m, int[] section) {
            int[] wall = new int[n];
            int answer = 0;
            for (int i = 0; i < section.length; i++) {
                wall[section[i]-1] = 1;
            }
            for (int i = 0; i < wall.length; i++) {
                if (wall[i] == 1) {
                    answer++;
                    int length = i+m;
                    if(length>wall.length) length = wall.length;
                    for (int j = i; j < length; j++) {
                        wall[j] = 0;
                    }
                }
            }
            return answer;
        }
    }
}