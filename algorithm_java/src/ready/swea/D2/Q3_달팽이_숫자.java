package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_달팽이_숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int x = 0, y = 0, cnt = 1, dr = 0;
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};
            int[][] arr = new int[N][N];

            arr[x][y] = cnt;
            cnt++;
            while (cnt <= N * N) {
                int nx = x + dx[dr];
                int ny = y + dy[dr];
                if (nx >= 0 && nx < N && ny < N && ny >= 0 && arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                    arr[x][y] = cnt;
                    cnt++;
                } else {
                    dr = (dr + 1) % 4;
                }
            }
            System.out.println("#"+tc);
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    System.out.print(anInt+" ");
                }
                System.out.println();
            }
        }
    }
}

