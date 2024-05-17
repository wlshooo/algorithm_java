package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q62_계산기_ {
    static int N;
    static int[] array;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            result = 0;
            dfs(1, array[0]);

            System.out.println("#" + tc + " " + result);

        }
    }

    static void dfs(int depth, int sum) {
        if (depth == N) {
            result = Math.max(result, sum);
            return;
        }
        dfs(depth + 1, sum + array[depth]);
        dfs(depth + 1, sum * array[depth]);

    }
}
