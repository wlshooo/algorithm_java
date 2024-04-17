package programmers.level1;

public class Q문자열_다루기_기분 {
    class Solution {
        public boolean solution(String s) {
            boolean answer = true;
            if(s.length()==4 || s.length()==6)
            {
                for(int i=0; i<s.length(); i++)
                {
                    if(s.charAt(i) - 48 >=0 && s.charAt(i) - 48 <10)
                    {
                        answer = true;
                    }
                    else
                    {
                        answer = false;
                        break;
                    }
                }
            }
            else answer = false;
            return answer;
        }
    }
}