package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;

public class Q23_규영이와_인영이의_카드게임 {
    static int T;
    static int[] A;
    static int[] B;
    static boolean[] visited;
    static int[] temp;
    static int score;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            B = new int[9];
            int aIndex = 0;
            int bIndex = 0;
            visited = new boolean[9];
            temp = new int[9];
            score = 0;
            Arrays.sort(A);

            for (int i = 1; i <= 18; i++) {
                if (aIndex < 9 && i == A[aIndex]) {
                    aIndex++;
                } else {
                    if (bIndex < 9) {
                        B[bIndex] = i;
                        bIndex++;
                    }
                }
            }

            dfs(0);
            int aLose = 362880 - score;
            System.out.println("#" + tc + " " + score + " " + aLose);
        }
    }

    static void dfs(int depth) {
        if (depth == 9) {
            int aScore = 0;
            int bScore = 0;

            for (int i = 0; i < 9; i++) {
                if (A[i] > temp[i]) {
                    aScore += A[i] + temp[i];
                } else {
                    bScore += A[i] + temp[i];
                }
            }

            if (aScore > bScore) {
                score++;
            }
            return;
        }

        for (int i = 0; i < 9; i++) {
            if (!visited[i]) {
                temp[depth] = B[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }

    }
}
