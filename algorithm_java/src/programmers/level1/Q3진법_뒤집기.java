package programmers.level1;

public class Q3진법_뒤집기 {
    class Solution {
        public int solution(int n) {
            if (n < 3) return n;
            int answer = 0;
            String temp = "";
            long number = 0;
            while (true) {
                temp += String.valueOf(n % 3);
                n = n / 3;
                if (n < 3) {
                    temp += String.valueOf(n);
                    break;
                }
            }
            number = Long.parseLong(temp);
            int index = 0;
            while (index < temp.length()) {
                answer += (number % 10) * Math.pow(3, index);
                number = number / 10;
                index++;
            }
            return answer;
        }
    }
}