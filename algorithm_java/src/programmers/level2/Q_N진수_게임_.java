package programmers.level2;

public class Q_N진수_게임_ {
    static class Solution {
        public String solution(int n, int t, int m, int p) {
            StringBuilder convert = new StringBuilder();
            StringBuilder answer = new StringBuilder();

            // convert의 길이가 미리 구할 숫자 갯수 * 게임 참가 인원만큼 될 때 까지 n진수로 변환
            for(int i = 0; convert.length() <= t * m; i++){
                convert.append(Integer.toString(i, n));
            }

            // 튜브의 순서에 해당하는 글자들만 추출
            for(int i = p - 1;  answer.length() < t; i += m){
                answer.append(convert.charAt(i));
            }

            return answer.toString().toUpperCase();
        }
    }

    public static void main(String[] args) {
        int n=2;
        int t=4;
        int m=2;
        int p=1;
        Solution s = new Solution();
        String solution = s.solution(n, t, m, p);
        System.out.println(solution);
    }
}
