package programmers.level1;

public class Q가운데_글자_가져오기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            if(s.length()%2==1)
            {
                String[] split = s.split("");
                answer = split[split.length/2];
                return answer;
            }
            else
            {
                String[] split = s.split("");
                answer = split[split.length/2-1] +split[split.length/2];
                return answer;
            }

        }
    }
}