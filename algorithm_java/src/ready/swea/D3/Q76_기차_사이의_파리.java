package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q76_기차_사이의_파리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int d =s[0];
            double a =s[1];
            double b =s[2];
            double f =s[3];

            double time = 0;
            double result =0;

            time = d/(a+b);
            result = time * f;

            System.out.println("#"+i+" "+result);
        }
    }
}
