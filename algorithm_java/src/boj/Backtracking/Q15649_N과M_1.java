package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//S3
public class Q15649_N과M_1 {
    static int N;
    static int M;

    static int[] arr;
    static boolean[] visited;

    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        sb = new StringBuilder();
        arr = new int[M];
        visited = new boolean[N];

        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int index : arr) {
                sb.append(index).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
