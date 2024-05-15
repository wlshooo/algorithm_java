package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q44_원_안의_점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for (int x = 0; x <= N; x++) {
                for (int y = 0; y <= N; y++) {
                    if (x == 0 && y == 0) continue;
                    if ((x * x + y * y) <= N * N) {
                        count++;
                    }
                }
            }
            System.out.println("#" + tc + " " + (count * 4 + 1 - (N * 4)));
        }
    }
}
