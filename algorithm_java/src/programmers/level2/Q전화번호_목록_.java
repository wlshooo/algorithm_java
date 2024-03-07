package programmers.level2;

import java.util.HashMap;

public class Q전화번호_목록_ {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        Solution s = new Solution();
        boolean solution = s.solution(phone_book);
        System.out.println(solution);
    }
    static class Solution {
        public boolean solution(String[] phone_book) {
            HashMap<String,String> map = new HashMap<>();

            for (int i = 0; i < phone_book.length; i++) {
                map.put(phone_book[i],phone_book[i]);
            }

            for (int i = 0; i < phone_book.length; i++) {

                for (int j = 0; j < phone_book[i].length(); j++) {
                    if (map.containsKey(phone_book[i].substring(0,j))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
