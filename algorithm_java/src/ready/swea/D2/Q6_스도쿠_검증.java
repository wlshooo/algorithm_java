package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q6_스도쿠_검증 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[][] map = new int[9][9];

            for (int i = 0; i < 9; i++) {
                int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int j = 0; j < 9; j++) {
                    map[i][j] = array[j];
                }
            }

            if (sudokuVerification(map) && squareCheck(map)) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }


        }
    }


    static boolean sudokuVerification(int[][] map) {
        for (int i = 0; i < 9; i++) {
            int[] rowCheckArr = new int[9];
            int[] columnCheckArr = new int[9];

            for (int j = 0; j < 9; j++) {
                rowCheckArr[map[i][j] - 1]++;
                columnCheckArr[map[j][i] - 1]++;
            }
            if (!checkCount(rowCheckArr) || !checkCount(columnCheckArr)) {
                return false;
            }
        }
        return true;
    }


    static boolean checkCount(int[] checkArr) {
        for (int i : checkArr) {
            if (i != 1) return false;
        }
        return true;
    }

    static boolean squareCheck(int[][] map) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int sum = 0;
                for (int x = 0; x < 3; x++)
                    for (int y = 0; y < 3; y++)
                        sum += map[i + x][j + y];
                if (sum != 45) {
                    return false;
                }
            }
        }
        return true;
    }
}
