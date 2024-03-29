package programmers.level1;

public class Q대충_만든_자판_ {
    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];

            // 각 타겟 문자열에 대해 최소 횟수 계산
            for (int i = 0; i < targets.length; i++) {
                String target = targets[i];
                int minPress = 0; // 문자열을 한 번에 작성하는 데 필요한 최소 횟수

                // 타겟 문자열의 각 문자에 대해 계산
                for (int j = 0; j < target.length(); j++) {
                    char currentChar = target.charAt(j);
                    int minForKey = Integer.MAX_VALUE;

                    // 현재 문자를 찾을 수 있는 키에 대해 계산
                    for (int k = 0; k < keymap.length; k++) {
                        int indexOfChar = keymap[k].indexOf(currentChar);

                        // 현재 문자가 키에 할당되어 있으면 최소 횟수 갱신
                        if (indexOfChar != -1) {
                            minForKey = Math.min(minForKey, indexOfChar + 1);
                        }
                    }

                    // 현재 문자를 찾을 수 없는 경우, -1을 저장하고 계산 종료
                    if (minForKey == Integer.MAX_VALUE) {
                        minPress = -1;
                        break;
                    } else {
                        minPress += minForKey;
                    }
                }

                // 최종 결과 저장
                answer[i] = minPress;
            }

            return answer;
        }
    }
}