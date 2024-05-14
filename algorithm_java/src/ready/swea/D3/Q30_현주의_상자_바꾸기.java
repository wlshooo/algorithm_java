package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q30_현주의_상자_바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]);
            int Q = Integer.parseInt(split[1]);
            int[] result = new int[N];
            for (int i = 1; i <= Q; i++) {
                int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int start = array[0];
                int end = array[1];

                for (int j = start - 1; j <= end - 1; j++) {
                    result[j] = i;
                }
            }

            System.out.print("#"+tc+" ");
            for (int i : result) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
