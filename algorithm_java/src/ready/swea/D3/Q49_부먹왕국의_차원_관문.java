package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q49_부먹왕국의_차원_관문 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int N = array[0];
            int D = array[1];
            int[] capital = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int result = 0;

            if (capital[0] == 0) {
                result++;
                capital[0] = 1;
            }
            if (capital[N - 1] == 0) {
                result++;
                capital[N - 1] = 1;
            }
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (capital[j] == 1) {
                    count = 0;
                } else {
                    count++;
                    if (count >= D) {
                        result++;
                        count = 0;
                    }
                }
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
