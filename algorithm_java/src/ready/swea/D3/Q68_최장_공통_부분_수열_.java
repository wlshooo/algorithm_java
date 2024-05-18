package ready.swea.D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//dp - https://kjs990114.tistory.com/18
public class Q68_최장_공통_부분_수열_ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        int[][] dp;
        for (int k = 1; k <= TC; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            int LEN_A = a.length();
            int LEN_B = b.length();
            dp = new int[LEN_A + 1][LEN_B + 1];

            for (int i = 1; i <= LEN_A; i++) {
                for (int j = 1; j <= LEN_B; j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            System.out.println("#" + k + " " + dp[LEN_A][LEN_B]);

        }

    }
}
