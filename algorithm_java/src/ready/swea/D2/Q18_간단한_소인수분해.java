package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18_간단한_소인수분해 {
    static int[] div;
    static int[] count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            div = new int[]{2, 3, 5, 7, 11};
            count = new int[5];
            solve(N);

            System.out.print("#"+tc+" ");
            for (int i : count) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void solve(int N) {
        while (N > 2) {
            for (int i = 0; i < div.length; i++) {
                if (N % div[i] == 0) {

                    N /=div[i];
                    count[i]++;
                    break;
                }
            }
        }
    }
}
