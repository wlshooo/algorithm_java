package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11_숫자_배열_회전 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];

            for (int i = 0; i < N; i++) {
                int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int j = 0; j < N; j++) {
                    map[i][j] = array[j];
                }
            }
            int[][] rotate_90 = rightAngleRotation(map, N);
            int[][] rotate_180 = rightAngleRotation(rotate_90, N);
            int[][] rotate_270 = rightAngleRotation(rotate_180, N);

            System.out.println("#"+tc);
            for (int i = 0; i < N; i++) {
                printAnswer(rotate_90,i,N);
                printAnswer(rotate_180,i,N);
                printAnswer(rotate_270,i,N);
                System.out.println();
            }
        }
    }
    static int[][] rightAngleRotation(int[][] map, int N)
    {
        int[][] nMap = new int[N][N];
        int x =0;
        int y =0;
        for (int i = 0; i <= N-1; i++) {
            for (int j = N - 1; j >= 0; j--) {
                nMap[x][y++%N] = map[j][i];
            }
            x++;
        }
        return nMap;
    }

    static void printAnswer(int[][] map , int x,int N) {
        String answer = "";
        for (int i = 0; i < N; i++) {
            answer+=map[x][i];
        }
        System.out.print(answer+" ");
    }
}
