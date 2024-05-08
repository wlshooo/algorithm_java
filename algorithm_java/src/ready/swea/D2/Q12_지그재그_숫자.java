package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12_지그재그_숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int i = 1; i <= N; i++) {

                if (i % 2 == 1) {
                    sum += i;
                } else {
                    sum -= i;
                }
            }

            System.out.println("#"+tc+" "+sum);
        }
    }
}
