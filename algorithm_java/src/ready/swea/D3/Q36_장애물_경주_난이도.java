package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q36_장애물_경주_난이도 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] obstacle = Arrays.stream(br.readLine().split((" "))).mapToInt(Integer::parseInt).toArray();
            int upMax = 0;
            int downMax = 0;
            for (int i = 0; i < N - 1; i++) {
                if (obstacle[i] < obstacle[i + 1]) {
                    upMax = Math.max(upMax, (obstacle[i + 1] - obstacle[i]));
                } else {
                    downMax = Math.max(downMax, (obstacle[i] - obstacle[i + 1]));
                }
            }

            System.out.println("#" + tc + " " + upMax + " " + downMax);
        }
    }
}
