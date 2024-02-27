package programmers.level1;

public class Q2016년 {
    class Solution {
        public String solution(int a, int b) {
            int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
            String[] date = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int d=b;
            for (int i = 0; i < a-1; i++) {
                d+=day[i];
            }
            if(d%7==0) d = 6;
            else d= d%7-1;
            return date[d];
        }
    }
}