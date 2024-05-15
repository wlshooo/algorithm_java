package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q39_통나무_자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());

            if (N % 2 == 1) {
                System.out.println("#" + tc + " " + "Bob");
            } else {
                System.out.println("#" + tc + " " + "Alice");
            }
        }

    }
}
