package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1_View{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int tc = 1; tc <= 10; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int result = 0;
            for (int i = 2; i < N - 2; i++) {
                int fl = arr[i] - arr[i - 2];
                int sl = arr[i] - arr[i - 1];
                int fr = arr[i] - arr[i + 1];
                int sr = arr[i] - arr[i + 2];

                if (fl > 0 && sl > 0 && fr > 0 && sr > 0) {
                    result += Math.min(fl, Math.min(sl, Math.min(fr, sr)));
                }
            }
            System.out.println("#"+tc+" " + result);
        }
    }
}
