package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//S2
public class Q15665_N과M_11 {
    static int N;
    static int M;
    static int[] arr;
    static int[] answer;
    static Set<String> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = new int[M];

        Arrays.sort(arr);

        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == M) {
            StringBuilder tmp = new StringBuilder();
            for(int i=0;i<M;i++) {
                tmp.append(answer[i]).append(' ');
            }
            tmp.append('\n');
            String str = tmp.toString();

            if(!set.contains(str)) {
                set.add(str);
                sb.append(tmp);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            answer[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}
