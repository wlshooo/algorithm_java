package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q31_정곤이의_단조_증가하는_수 {
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            max = -1;
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int num = array[i] * array[j];
                    increase(num);
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }

    static void increase(int num) {
        String string = Integer.toString(num);
        boolean isCheck = true;

        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) - '0' > string.charAt(i + 1) - '0') {
                isCheck = false;
                break;
            }
        }
        if (isCheck) {
            max = Math.max(max, num);
        }
    }
}
