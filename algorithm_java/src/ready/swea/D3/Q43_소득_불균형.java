package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q43_소득_불균형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(array).sum();
            int avg = sum / N;
            int count = 0;
            for (int i : array) {
                if (i <= avg) {
                    count++;
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}
