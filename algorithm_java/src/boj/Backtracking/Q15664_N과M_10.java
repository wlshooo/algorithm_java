package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q15664_N과M_10 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static int[] answer;
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        visited = new boolean[N];
        answer = new int[M];

        Arrays.sort(arr);

        dfs(0);
    }

    static void dfs(int depth) {
        if (depth == M) {
            String result = "";

            for (int i : answer) {
                result += i + " ";
            }

            if (!duplicateCheck(result) && sizeCompare(result)) {
                System.out.println(result);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

    static boolean duplicateCheck(String string) {
        if (map.containsKey(string)) {
            return true;
        } else {
            map.put(string, 0);
            return false;
        }
    }

    static boolean sizeCompare(String string) {
        String[] split = string.split(" ");
        for (int i = 0; i < split.length - 1; i++) {
            if (Integer.parseInt(split[i]) > Integer.parseInt(split[i + 1])) {
                return false;
            }
        }
        return true;

    }
}
