package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q9_햄버거_다이어트 {
    static int N;
    static int L;
    static int[] score;
    static int[] calorie;

    static int sum;
    static int calories;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            N = array[0];
            L = array[1];
            sum = 0;
            calories = 0;
            score = new int[N];
            calorie = new int[N];

            for (int i = 0; i < N; i++) {
                int[] split = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                score[i] = split[0];
                calorie[i] = split[1];
            }

            dfs(0,0, 0);
            System.out.println("#"+ tc+" "+sum);
        }

    }
    static void dfs(int depth, int cal, int sumScore) {
        if (depth == N ) {
            if (cal < L) {
                sum = Math.max(sum,sumScore);
            }
            return;
        }
        cal += calorie[depth];
        sumScore+=score[depth];
        dfs(depth+1, cal, sumScore);

        cal-= calorie[depth];
        sumScore-=score[depth];
        dfs(depth+1, cal, sumScore);
    }
}
