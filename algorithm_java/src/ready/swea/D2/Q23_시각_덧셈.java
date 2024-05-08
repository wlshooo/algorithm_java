package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q23_시각_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int ft = array[0];
            int fm = array[1];
            int st = array[2];
            int sm = array[3];

            int time = ft + st;
            int minute = fm + sm;

            if (time > 12) {
                time = time - 12;
            }
            if (minute > 59) {
                time++;
                minute = minute - 60;
            }


            System.out.println("#"+tc+" "+time+" "+minute);
        }
    }
}
