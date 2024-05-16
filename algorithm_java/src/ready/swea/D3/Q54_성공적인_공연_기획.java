package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q54_성공적인_공연_기획 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split("");
            int employ = 0;
            int count = Integer.parseInt(split[0]);

            for (int i = 1; i < split.length; i++) {
                int current = Integer.parseInt(split[i]);
                if (count >= i) {
                    count += current;
                } else {
                    employ += (i - count);
                    count = i + current;
                }
            }

            System.out.println("#" + tc + " " + employ);
        }
    }
}
