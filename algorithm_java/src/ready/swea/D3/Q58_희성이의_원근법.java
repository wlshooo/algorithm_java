package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q58_희성이의_원근법 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            float f = (float) N / 1000;

            if (f < 0.1) {
                System.out.println("#" + tc + " " + 0);
            } else if (f >= 0.1 && f < 1) {
                System.out.println("#" + tc + " " + 1);
            } else if (f >= 1 && f < 10) {
                System.out.println("#" + tc + " " + 2);
            } else if (f >= 10 && f < 100) {
                System.out.println("#" + tc + " " + 3);
            } else if (f >= 100 && f < 1000) {
                System.out.println("#" + tc + " " + 4);
            } else {
                System.out.println("#" + tc + " " + 5);
            }
        }
    }
}
