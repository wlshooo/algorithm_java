package programmers.level1;

public class Q다트_게임_ {
    class Solution {
        public int solution(String dartResult) {
            int answer = 0;
            int[] dart = new int[3]; // 3회의 다트 기회에 대한 결과를 저장할 배열

            int n = 0, idx = 0; // n은 숫자를 임시로 저장할 변수, idx는 dart 배열의 인덱스를 나타내는 변수
            String numstr = ""; // 숫자를 문자열로 저장할 변수

            // 주어진 다트 결과 문자열을 한 글자씩 읽어가면서 처리
            for (int i = 0; i < dartResult.length(); i++) {
                char c = dartResult.charAt(i);

                // 숫자일 때
                if (c >= '0' && c <= '9') {
                    numstr += String.valueOf(c); // 숫자를 numstr에 추가
                }
                // 보너스일 때
                else if (c == 'S' || c == 'D' || c == 'T') {
                    n = Integer.parseInt(numstr); // 문자열을 정수로 변환하여 n에 저장
                    if (c == 'S') {
                        dart[idx++] = (int) Math.pow(n, 1); // 1제곱을 dart 배열에 저장
                    } else if (c == 'D') {
                        dart[idx++] = (int) Math.pow(n, 2); // 2제곱을 dart 배열에 저장
                    } else {
                        dart[idx++] = (int) Math.pow(n, 3); // 3제곱을 dart 배열에 저장
                    }
                    numstr = ""; // numstr 초기화
                }
                // 옵션일 때
                else {
                    if (c == '*') {
                        dart[idx - 1] *= 2; // 현재 기회의 점수를 2배로 만듦
                        if (idx - 2 >= 0)
                            dart[idx - 2] *= 2; // 이전 기회의 점수를 2배로 만듦 (단, 0 이상일 때만)
                    } else {
                        dart[idx - 1] *= (-1); // 현재 기회의 점수를 -1배로 만듦 (즉, 음수로 만듦)
                    }
                }
            }

            // 세 기회의 점수를 모두 더한 값을 최종 결과로 저장
            answer = dart[0] + dart[1] + dart[2];

            return answer;
        }
    }
}