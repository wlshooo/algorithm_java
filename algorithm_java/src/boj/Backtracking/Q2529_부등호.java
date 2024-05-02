package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//S1


public class Q2529_부등호 {
    static int K;
    static long max = Long.MIN_VALUE;
    static long min = Long.MAX_VALUE;
    static boolean[] visited;
    static char[] inequalitySign;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        inequalitySign = new char[K];
        String[] signs = br.readLine().split(" ");
        for (int i = 0; i < K; i++) {
            inequalitySign[i] = signs[i].charAt(0);
        }
        visited = new boolean[10];
        answer = new int[K + 1];

        dfs(0);
        System.out.printf("%0" + (K + 1) + "d\n", max);
        System.out.printf("%0" + (K + 1) + "d\n", min);
    }

    static void dfs(int depth) {
        if (depth == K + 1) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < K + 1; i++) {
                result.append(answer[i]);
            }
            long num = Long.parseLong(result.toString());
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!visited[i]) {
                if (depth == 0 || satisfyCondition(answer[depth - 1], i, inequalitySign[depth - 1])) {
                    visited[i] = true;
                    answer[depth] = i;
                    dfs(depth + 1);
                    visited[i] = false;
                }
            }
        }
    }

    static boolean satisfyCondition(int a, int b, char op) {
        return op == '<' ? a < b : a > b;
    }
}
