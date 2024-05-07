package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q9_어디에_단어가_들어갈_수_있을까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int N = array[0];
            int K = array[1];
            int[][] map = new int[N][N];

            for (int i = 0; i < N; i++) {
                int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int j = 0; j < N; j++) {
                    map[i][j] = input[j];
                }
            }

            int result = solve(map, N, K);
            System.out.println("#" + tc + " " + result);
        }
    }

    static int solve(int[][] map, int N, int K) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int rowCount = 0;
            int columnCount = 0;

            for (int j = 0; j < N; j++) {

                if (map[i][j] == 1) {
                    rowCount++;
                } else if (map[i][j]==0) {
                    if(rowCount==K) count++;
                    rowCount = 0;
                }

                if (map[j][i] == 1) {
                    columnCount++;
                } else if (map[j][i]==0) {
                    if(columnCount==K) count++;
                    columnCount = 0;
                }
            }
            if(rowCount==K) count++;
            if(columnCount==K) count++;
        }
        return count;
    }
}
