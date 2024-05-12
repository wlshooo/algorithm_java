package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q19_준환이의_운동관리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int L = array[0];
            int U = array[1];
            int X = array[2];

            if (X > U) {
                System.out.println("#" + tc+" " + (-1));
            } else if (X < L) {
                System.out.println("#" + tc + " " + (L - X));
            } else {
                System.out.println("#" + tc+" " + (0));
            }
        }
    }
}
