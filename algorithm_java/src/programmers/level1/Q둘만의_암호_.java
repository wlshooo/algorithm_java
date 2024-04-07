package programmers.level1;

public class Q둘만의_암호_ {
    class Solution {
        public String solution(String s, String skip, int index) {
            String answer ="";
            for (int i = 0; i < s.length(); i++) {
                char temp =s.charAt(i);
                for (int k = 0; k < index; k++) {
                    temp +=1;
                    if(temp>'z') temp-=26;
                    if(skip.contains(String.valueOf(temp))) k--;
                }

                answer+=temp;
            }

            return answer;

        }
    }
}