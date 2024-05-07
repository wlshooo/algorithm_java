package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_파리_퇴치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int max = 0;
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]);
            int M = Integer.parseInt(split[1]); //flapper
            int[][] fly = new int[N][N];

            for (int i = 0; i < N; i++) {
                String[] flySplit = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    fly[i][j] = Integer.parseInt(flySplit[j]);
                }
            }

            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    max = Math.max(max, catchFly(i, j, fly, M));
                }
            }

            System.out.println("#" + tc + " " + max);
        }

    }

    static int catchFly(int x, int y, int[][] fly, int M) {
        int count = 0;
        for (int i = x; i < x + M; i++) {
            for (int j = y; j < y + M; j++) {
                count += fly[i][j];
            }
        }
        return count;
    }
}
