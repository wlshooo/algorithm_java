package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//S3
public class Q10974_모든_순열 {
    static int N;
    static boolean[] visited;
    static int[] answer;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        answer = new int[N];
        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int depth) {

        if (depth == N) {
            for (int i : answer) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[depth] = i+1;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
