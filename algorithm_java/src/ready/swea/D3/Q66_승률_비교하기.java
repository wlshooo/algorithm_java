package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q66_승률_비교하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            int C = Integer.parseInt(split[2]);
            int D = Integer.parseInt(split[3]);

            float alice = (float) A / B;
            float bob = (float) C / D;

            if (alice == bob) {
                System.out.println("#" + tc + " " + "DRAW");
            } else if (alice > bob) {
                System.out.println("#" + tc + " " + "ALICE");
            } else {
                System.out.println("#" + tc + " " + "BOB");
            }
        }
    }
}
