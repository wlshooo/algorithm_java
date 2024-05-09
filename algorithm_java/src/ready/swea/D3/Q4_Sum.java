package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q4_Sum {
    static int max;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        for (int tc = 1; tc <= 10; tc++) {
            max = 0;
            int N = Integer.parseInt(br.readLine());
            arr = new int[100][100];
            init();
            solve();
            System.out.println("#" + N + " " + max);
        }
    }

    private static void solve() {
        int diagonalA = 0;  // -> \모양 대각선
        int diagonalB = 0;  // -> /모양 대각선
        for (int i = 0; i < 100; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < 100; j++) {
                if (i + j == 99) {
                    diagonalB += arr[i][j];
                }
                if (i == j) {
                    diagonalA += arr[i][j];
                }
                rowSum += arr[i][j];
                columnSum += arr[j][i];
            }
            max = Math.max(rowSum, max);
            max = Math.max(columnSum, max);
        }
        max = Math.max(max, Math.max(diagonalA, diagonalB));
    }

    private static void init() throws IOException {
        for (int i = 0; i < 100; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < 100; j++) {
                arr[i][j] = array[j];
            }
        }
    }
}
