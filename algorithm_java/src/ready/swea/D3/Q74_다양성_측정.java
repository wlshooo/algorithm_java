package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q74_다양성_측정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] arr = new int[10];
            int count = 0;
            int[] array = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int i1 : array) {
                arr[i1]++;
            }
            for (int i1 : arr) {
                if (i1 != 0) {
                    count++;
                }
            }
            System.out.println("#" + i + " " + count);
        }

    }
}
