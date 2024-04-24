package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//S2
public class Q15663_N과M_9 {
    static int N;
    static int M;

    static int[] array;

    static int[] temp;

    static boolean[] visited;
    static Map<String, Integer> store = new HashMap<>();

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = input[0];
        M = input[1];
        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        temp = new int[M];
        visited = new boolean[N];
        Arrays.sort(array);

        dfs(0, 0);

        System.out.println(sb);
    }

    private static boolean isDuplicate(String string) {
        if (store.containsKey(string)) {
            return true;
        }
        store.put(string, 0);
        return false;

    }


    static void dfs(int start, int depth) {

        if (depth == M) {
            String string = "";
            for (Integer integer : temp) {
                string += integer + " ";
            }
            if (!isDuplicate(string)) {
                sb.append(string + "\n");
            }
            return;
        }


        for (int i = start; i < array.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[depth] = array[i];
                dfs(start, depth + 1);
                visited[i] = false;
            }
        }
    }
}
