package programmers.level1;

public class Q서울에서_김서방_찾기 {
    class Solution {
        public String solution(String[] seoul) {
            String answer = "";
            int index =0;
            for(int i=0; i<seoul.length; i++)
            {
                if(seoul[i].equals("Kim"))
                {
                    index = i;
                    break;
                }
            }
            answer="김서방은 "+index+"에 있다";
            return answer;
        }
    }
}