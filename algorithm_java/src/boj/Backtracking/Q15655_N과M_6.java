package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//S3
public class Q15655_N과M_6 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static int[] ans;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        visited = new boolean[N];
        ans = new int[M];

        Arrays.sort(arr);

        dfs(0,0);
        System.out.println(sb);
    }

    static void dfs(int start ,int depth) {
        if (depth == M) {
            for (int an : ans) {
                sb.append(an).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                ans[depth] = arr[i];
                dfs(i,depth+1);
                visited[i] = false;
            }
        }
    }
}
