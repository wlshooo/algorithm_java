package programmers.level1;

public class Q로또의_최고_순위와_최저_순위 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int[] lottoArr = new int[46];
            int count = 0;
            int zeroCount = 0;

            for (int lotto : lottos) {
                if (lotto == 0) {
                    zeroCount++;
                } else {
                    lottoArr[lotto]++;
                }
            }

            for (int win_num : win_nums) {
                lottoArr[win_num]++;
                if (lottoArr[win_num] == 2) {
                    count++;
                }
            }

            int max = count + zeroCount;
            int min = count;

            answer[0] = Math.min(7 - max, 6);
            answer[1] = Math.min(7 - min, 6);

            return answer;
        }
    }
}