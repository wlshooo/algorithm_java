package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q18_부분수열의_합 {
    static int N;
    static int K;
    static int[] arr;
    static boolean[] visited;
    static int[] temp;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            N = array[0];
            K = array[1];
            arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            visited = new boolean[N];
            temp = new int[N];
            result = 0;
            dfs(0,0,0);
            System.out.println("#" + tc + " " + result);
        }
    }
    static void dfs(int start ,int depth, int sum) {
        if (depth == N) {
            return;
        }
        if (sum == K) {
            result++;
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sum+=arr[i];
                dfs(i,depth+1,sum);
                sum-=arr[i];
                visited[i] = false;
            }
        }
    }
}
