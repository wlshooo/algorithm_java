package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q40_1차원_정원 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int N = array[0];
            int D = array[1];
            int result = 0;
            result += N / (2 * D + 1);
            if (N % (2 * D + 1) != 0) {
                result += 1;
            }

            System.out.println("#" + tc + " " + result);
        }
    }
}
