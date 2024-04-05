package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q오픈채팅방 {
    public static void main(String[] args) {
        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
        Solution solution = new Solution();
        String[] result = solution.solution(record);
        for (String s : result) {
            System.out.println(s);
        }

    }

    static class Solution {
        public String[] solution(String[] record) {
            Map<String, String> userNicknameMap = new HashMap<>();
            List<String> messageList = new ArrayList<>();

            for (String log : record) {
                String[] parts = log.split(" ");
                String command = parts[0];
                String userId = parts[1];

                if (command.equals("Enter") || command.equals("Change")) {
                    String userNickname = parts[2];
                    userNicknameMap.put(userId, userNickname); // 유저의 닉네임 갱신
                }
            }

            for (String log : record) {
                String[] parts = log.split(" ");
                String command = parts[0];
                String userId = parts[1];

                if (command.equals("Enter")) {
                    messageList.add(userNicknameMap.get(userId) + "님이 들어왔습니다.");
                } else if (command.equals("Leave")) {
                    messageList.add(userNicknameMap.get(userId) + "님이 나갔습니다.");
                }
            }

            String[] answer = new String[messageList.size()];
            messageList.toArray(answer);
            return answer;
        }
    }
}