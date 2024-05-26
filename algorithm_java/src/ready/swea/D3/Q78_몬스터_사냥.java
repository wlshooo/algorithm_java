package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q78_몬스터_사냥 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int d = array[0];
            int l = array[1];
            int n = array[2];

            int damage = 0;

            double percentage = l * 0.01;

            for (int j = 0; j < n; ++j) {
                damage +=  (d * (1 + (j * percentage)));
            }
            System.out.println("#"+i+" "+damage);
        }
    }
}
