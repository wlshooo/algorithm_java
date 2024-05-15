package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q46_팔씨름 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String s = br.readLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='x') count++;
            }
            String answer = count < 8 ? "YES" : "NO";

            System.out.println("#"+tc+" "+answer);
        }
    }
}
