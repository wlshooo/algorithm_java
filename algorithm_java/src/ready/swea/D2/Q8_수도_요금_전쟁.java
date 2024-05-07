package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q8_수도_요금_전쟁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int P = array[0];
            int Q = array[1];
            int R = array[2];
            int S = array[3];
            int W = array[4];

            int payA = companyA(P, W);
            int payB = companyB(Q, R, S, W);

            System.out.println("#"+ tc+" "+Math.min(payA,payB));
        }
    }

    static int companyA(int P, int W) {
        return P * W;
    }

    static int companyB(int Q, int R, int S, int W) {
        if (W <= R) {
            return Q;
        } else {
            int overL = W-R;
            return Q+(overL * S);
        }
    }
}
