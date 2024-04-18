package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//S3
public class Q15650_N과M_2 {
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

        dfs(1,0);
        System.out.println(sb);

    }

    static void dfs(int at , int depth) {

        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i <= N; i++) {

            arr[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}
