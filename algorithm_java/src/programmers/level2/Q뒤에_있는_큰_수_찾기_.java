package programmers.level2;

import java.util.*;

public class Q뒤에_있는_큰_수_찾기_ {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2,3,3,5};
        int[] solution = s.solution(numbers);
        for (int T : solution) {
            System.out.println(T);
        }
    }

    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            Stack<Integer> s = new Stack<>();

            for(int i=numbers.length-1; i>=0; i--){
                while(!s.isEmpty()){
                    if(s.peek() > numbers[i]){
                        answer[i] = s.peek();
                        break;
                    }else{
                        s.pop();
                    }
                }
                if(s.isEmpty()){
                    answer[i] = -1;
                }
                s.push(numbers[i]);
            }
            return answer;
        }
    }
}
