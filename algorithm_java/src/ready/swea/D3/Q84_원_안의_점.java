package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q84_원_안의_점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
                    if (j == 0 && k == 0) continue;
                    if ((j * j + k * k) <= N * N) {

                        count++;
                    }
                }
            }
            System.out.println("#" + i + " " + (count * 4 + 1 - (N * 4)));
        }
    }
}
