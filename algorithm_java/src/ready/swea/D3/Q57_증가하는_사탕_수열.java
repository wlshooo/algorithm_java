package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q57_증가하는_사탕_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int A = array[0];
            int B = array[1];
            int C = array[2];
            int count = 0;
            if (A < B && B < C) {
                System.out.println("#" + tc + " " + 0);
                continue;
            }
            int bcAbs = Math.abs(B - C);
            count += bcAbs + 1;
            B -= bcAbs + 1;
            if (A < B && B < C) {
                System.out.println("#" + tc + " " + count);
                continue;
            }
            int abAbs = Math.abs(B - A);
            count += abAbs + 1;
            A -= abAbs + 1;

            if (A >= 0 && A < B && B < C) {
                System.out.println("#" + tc + " " + count);
                continue;
            }
            if (A < 0 || B < 0 || C < 0) {
                System.out.println("#" + tc + " " + (-1));
            }

        }
    }
}
