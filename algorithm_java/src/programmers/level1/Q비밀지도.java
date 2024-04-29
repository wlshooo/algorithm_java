package programmers.level1;

import java.util.Arrays;

public class Q비밀지도 {
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[][] result = new String[n][n];
            String[] answer = new String[n];
            InitResultArr(result);

            InitAnswerArr(answer);

            cal(result, n, arr1, arr2);

            Transformation(result, answer);

            return answer;
        }

        private static void Transformation(String[][] result, String[] answer) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    if(result[i][j].equals("1")) answer[i]+="#";
                    else if (result[i][j].equals("0")) {
                        answer[i]+=" ";
                    }
                }
            }
        }

        private static void InitAnswerArr(String[] answer) {
            for (int i = 0; i < answer.length; i++) {
                answer[i]="";
            }
        }

        private static void cal(String[][] result, int n, int[] arr1, int[] arr2) {
            for (int i = 0; i < result.length; i++) {
                String binary1 = BinaryTransformation(n, arr1[i]);
                String binary2 = BinaryTransformation(n, arr2[i]);
                String[] split1 = binary1.split("");
                String[] split2 = binary2.split("");
                for (int j = 0; j < result.length; j++) {
                    if(split1[j].equals("1") || split2[j].equals("1")) result[i][j] = "1";
                }
            }
        }

        private static void InitResultArr(String[][] result) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    result[i][j] ="0";
                }
            }
        }

        public static String BinaryTransformation(int n, int num) {
            String temp ="";
            String result ="";
            while (true) {
                temp+=num%2;
                num=num/2;
                if (num == 0) {
                    if (temp.length() < n) {
                        int length = n - temp.length();
                        for (int i = 0; i < length; i++) {
                            temp+="0";
                        }
                    }
                    break;
                }
            }
            for (int i = temp.length() - 1; i >= 0; i--) {
                result = result + temp.charAt(i);
            }
            return result;
        }
    }
}