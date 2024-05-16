package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q48_새샘이의_7_3_5게임 {
    static int[] array;
    static boolean[] visited;
    static int sum;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            visited = new boolean[array.length];
            list = new ArrayList<>();
            sum = 0;

            dfs(0);

            list.sort(Collections.reverseOrder());
            System.out.println("#" + tc + " " + list.get(4));

        }
    }

    static void dfs(int depth) {
        if (depth == 3) {
            if (!list.contains(sum)) list.add(sum);
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sum += array[i];
                dfs(depth + 1);
                sum -= array[i];
                visited[i] = false;
            }
        }
    }
}
