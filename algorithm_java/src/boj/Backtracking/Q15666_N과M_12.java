package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//S2
public class Q15666_N과M_12 {
    static int N;
    static int M;
    static int[] answer;
    static int[] arr;
    static Map<String,Integer> store = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        N = Integer.parseInt(split[0]);
        M = Integer.parseInt(split[1]);
        answer = new int[M];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        dfs(0,0);
    }
    static void dfs(int start, int depth) {

        if (depth == M) {
            String string = "";
            for (int i : answer) {
                string+=i+" ";
            }
            if (!isDuplicate(string)) {
                System.out.println(string);
            }
            return;
        }

        for (int i = start; i < N; i++) {
            answer[depth] = arr[i];
            dfs(i,depth+1);
        }
    }

    static boolean isDuplicate(String string) {
        if (store.containsKey(string)) {
            return true;
        } else {
            store.put(string,0);
            return false;
        }
    }
}
