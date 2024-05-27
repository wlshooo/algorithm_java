package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q79_구독자_전쟁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int N = array[0];
            int A = array[1];
            int B = array[2];
            int min = 0;
            int max = Math.min(A,B);
            if ((A + B) < N) {
                min = 0;
            } else {
                min = A+B -N;
            }
            System.out.println("#"+i+" "+max+" "+min);
        }
    }
}
