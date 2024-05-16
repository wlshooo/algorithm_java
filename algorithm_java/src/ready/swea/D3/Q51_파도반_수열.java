package ready.swea.D3;

import java.util.Scanner;

public class Q51_파도반_수열 {
    static long[] arr = new long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; ++tc) {
            int n = sc.nextInt();

            arr[1] = 1L;
            arr[2] = 1L;
            arr[3] = 1L;

            for (int i = 4; i <= 100; ++i) {
                arr[i] = arr[i - 2] + arr[i - 3];
            }

            System.out.println("#" + tc + " " + arr[n]);
        }

        sc.close();
    }
}
