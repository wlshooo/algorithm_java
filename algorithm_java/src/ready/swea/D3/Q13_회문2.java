package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//[S/W 문제해결 기본] 3일차 - 회문2
public class Q13_회문2 {
    static int max;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 10; i++) {
            max = 0;
            int T = Integer.parseInt(br.readLine());

            String[][] arr = new String[100][100];

            for (int j = 0; j < 100; j++) {
                String[] array = br.readLine().split("");
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = array[k];
                }
            }

            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    String rowStr = "";
                    String columnStr = "";
                    for (int z = k; z < 100; z++) {
                        rowStr += arr[j][z];
                        if (rowStr.length() == 1) {
                            max = Math.max(max, 1);
                        } else {
                            cal(rowStr);
                        }
                        columnStr += arr[z][j];
                        if (columnStr.length() == 1) {
                            max = Math.max(max, 1);
                        } else {
                            cal(columnStr);
                        }


                    }
                }
            }
            System.out.println("#" + T + " " + max);
        }
    }

    public static void cal(String str) {
        int min = str.length() / 2;

        boolean isCheck = true;
        if (str.length() % 2 == 1) {
            int LI = (str.length() / 2) - 1;
            int RI = (str.length() / 2) + 1;
            for (int i = 0; i <= (str.length() - 1) / 2; i++) {
                char l = str.charAt(LI);
                char r = str.charAt(RI);
                if (l != r) {
                    isCheck = false;
                    break;
                }
                LI -= 1;
                RI += 1;
                if (LI < 0 || RI > str.length()) {
                    break;
                }
            }
            if (isCheck) {
                max = Math.max(max, str.length());
            }

        } else {
            int LI = (str.length() / 2) - 1;
            int RI = (str.length() / 2);
            for (int i = 0; i <= (str.length() - 1) / 2; i++) {
                char l = str.charAt(LI);
                char r = str.charAt(RI);
                if (l != r) {
                    isCheck = false;
                    break;
                }
                LI -= 1;
                RI += 1;
                if (LI < 0 || RI > str.length()) {
                    break;
                }
            }
            if (isCheck) {
                max = Math.max(max, str.length());
            }
        }
    }
}

