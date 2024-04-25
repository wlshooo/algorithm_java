package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//S2
public class Q10819_차이를_최대로 {
    static int N;
    static int[] arr;
    static int[] temp;
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        visited = new boolean[N];
        temp = new int[N];
        dfs(0);
        System.out.println(max);

    }
    static void dfs(int cnt) {

        if (cnt == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(temp[i] - temp[i+1]);
            }
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[cnt] = arr[i];
                dfs(cnt+1);
                visited[i] = false;
            }
        }
    }
}
