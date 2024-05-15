package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q42_최대_성적표_만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]);
            int K = Integer.parseInt(split[1]);
            int sum = 0;
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            for (int i = array.length - 1; i >= array.length - K; i--) {
                sum += array[i];
            }

            System.out.println("#" + tc + " " + sum);
        }

    }
}
