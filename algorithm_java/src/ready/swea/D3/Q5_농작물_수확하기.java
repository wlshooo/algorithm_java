package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q5_농작물_수확하기 {
    static int sum;
    static int[][] map;
    static int N;
    static int mid;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());

            if (N == 1) {
                int result = Integer.parseInt(br.readLine());
                System.out.println("#" + tc + " " + result);
                continue;
            }

            map = new int[N][N];
            sum = 0;
            for (int i = 0; i < N; i++) {
                int[] array = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
                for (int j = 0; j < N; j++) {
                    map[i][j] = array[j];
                }
            }

            mid = N / 2;

            for (int i = 0; i < N; i++) {
                sum += map[mid][i];
            }

            upCal();
            downCal();

            System.out.println("#"+tc+" "+ sum );
        }
    }

    private static void upCal() {
        int x=mid-1;
        int y=1;
        int count = map.length-2;
        while (true) {
            if (x == 0) {
                sum+=map[x][mid];
                break;
            }
            for (int i = y; i < y+count; i++) {
                sum+=map[x][i];
            }
            x--;
            y++;
            count-=2;
        }
    }

    private static void downCal() {
        int x=mid+1;
        int y=1;
        int count = map.length-2;
        while (true) {
           if(x==N-1) {
               sum+=map[x][mid];
               break;
           }
            for (int i = y; i < y+count; i++) {
                sum+=map[x][i];
            }
            x++;
            y++;
            count-=2;
        }
    }
}
