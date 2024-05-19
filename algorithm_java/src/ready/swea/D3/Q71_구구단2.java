package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q71_구구단2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int A = array[0];
            int B = array[1];

            if (A > 9 || B > 9) {
                System.out.println("#" +tc+" "+(-1));
                continue;
            }
            System.out.println("#"+tc+" "+(A*B));
        }
    }
}
