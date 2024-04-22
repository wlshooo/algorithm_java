package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//S2
public class Q6603_로또 {
    static int[] s;
    static int k;
    static boolean[] visited;
    static int[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (input.length == 1) {
                return;
            }
            k = input[0];
            s = new int[k];
            answer = new int[6];
            visited = new boolean[k];
            for (int i = 0; i < k; i++) {
                s[i] = input[i+1];
            }

            dfs(0,0);
            System.out.println();
        }
    }

    static void dfs(int start ,int depth) {
        if (depth == 6) {
            for (int i : answer) {
                System.out.print(i+ " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < k; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[depth] = s[i];
                dfs(i,depth+1);
                visited[i] = false;
            }
        }
    }
}
