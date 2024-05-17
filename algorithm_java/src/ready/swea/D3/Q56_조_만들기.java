package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q56_조_만들기 {
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split(" ");
            N = Integer.parseInt(split[0]);
            K = Integer.parseInt(split[1]);
            int[] result = new int[K];
            int increaseIndex = 1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < K; j++) {
                    if (i % 2 == 0) {
                        result[j] += increaseIndex;
                    } else {
                        result[K - j - 1] += increaseIndex;
                    }
                    increaseIndex++;
                }
            }
            System.out.print("#" + tc + " ");
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
