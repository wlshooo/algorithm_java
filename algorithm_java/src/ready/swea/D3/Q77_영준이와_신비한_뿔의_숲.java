package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q77_영준이와_신비한_뿔의_숲 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int N = s[0];
            int M = s[1];
            int twin = 0;
            int uni = 0;

            twin = N-M;
            uni = M-twin;
            System.out.println("#"+i+" "+uni+" "+twin);
        }
    }
}
