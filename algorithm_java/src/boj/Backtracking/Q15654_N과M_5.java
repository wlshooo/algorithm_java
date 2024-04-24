package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//S3
public class Q15654_N과M_5 {
    static int N;
    static int M;
    static int[] arr;

    static int[] temp;

    static boolean[] visited;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = array[0];
        M = array[1];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        temp = new int[M];
        visited = new boolean[N];

       Arrays.sort(arr);

       dfs(0);

        System.out.println(sb);
    }

    static void dfs(int depth) {

        if (depth == M) {
            for (int i : temp) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!visited[i]) {
                visited[i] = true;
                temp[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
