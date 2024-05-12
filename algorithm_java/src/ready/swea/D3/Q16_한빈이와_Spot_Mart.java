package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q16_한빈이와_Spot_Mart {
    static int N;
    static int M;
    static int[] weight;

    static int max;
    static int[] temp;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            N = array[0];
            M = array[1];
            max = Integer.MIN_VALUE;
            temp = new int[2];
            visited = new boolean[N];
            weight = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            dfs(0);

            if (max == Integer.MIN_VALUE) {
                System.out.println("#" + tc + " " + (-1));
            } else {
                System.out.println("#" + tc + " " + max);
            }

        }
    }

    static void dfs(int depth) {
        if (depth == 2) {
            int sum = 0;
            for (int i : temp) {
                sum += i;
            }
            if (sum <= M) {
                max = Math.max(max, sum);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[depth] = weight[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
