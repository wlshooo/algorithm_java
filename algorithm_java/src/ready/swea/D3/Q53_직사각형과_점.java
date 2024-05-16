package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q53_직사각형과_점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = s[0];
            int y1 = s[1];
            int x2 = s[2];
            int y2 = s[3];

            int BX = Math.max(x1, x2);
            int SX = Math.min(x1, x2);

            int BY = Math.max(y1, y2);
            int SY = Math.min(y1, y2);

            int case1 = 0;
            int case2 = 0;
            int case3 = 0;

            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                int[] s1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int x = s1[0];
                int y = s1[1];

                if ((x < BX && x > SX) && (y < BY && y > SY)) {
                    case1++;
                } else if ((x < SX || x > BX) || (y < SY || y > BY)) {
                    case3++;
                } else {
                    case2++;
                }
            }
            System.out.println("#" + tc + " " + case1 + " " + case2 + " " + case3);
        }
    }
}
