package ready.swea.D3;

import java.util.Scanner;

public class Q25_최장_증가_부분_수열_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] dp = new int[n];
            int max = 0;
            dp[0] = 1;

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for(int i = 1; i < n; i++) {
                dp[i] = 1;
                for(int j = 0; j < i; j++) {
                    if(a[j] < a[i] && dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                    }
                }
                max = Math.max(dp[i], max);
            }
            System.out.println("#" + t + " " + max);
        }
    }
}
