package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q55_숫자가_같은_배수 {
    static boolean[] visited;
    static String[] temp;
    static String[] arr;
    static int N;
    static int length;
    static boolean isCheck;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            if (N < 10 || N==1000000) {
                System.out.println("#" + tc + " " + "impossible");
                continue;
            }
            arr = String.valueOf(N).split("");
            length = arr.length;
            visited = new boolean[length];
            temp = new String[length];
            isCheck = false;

            dfs(0);

            if (isCheck) {
                System.out.println("#" + tc + " " + "possible");
            } else {
                System.out.println("#" + tc + " " + "impossible");
            }
        }
    }

    static void dfs(int depth) {
        if (depth == length) {
            String value = "";
            for (String s : temp) {
                value += s;
            }
            System.out.println(value);
            if (Integer.parseInt(value)!=N && Integer.parseInt(value) % N == 0) {
                isCheck = true;
            }
            return;

        }

        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
