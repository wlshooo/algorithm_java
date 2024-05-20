package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q72_석찬이의_받아쓰기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] split1 = br.readLine().split("");
            String[] split2 = br.readLine().split("");
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (split1[j].equals(split2[j])) {
                    count++;
                }
            }
            System.out.println("#"+i+" "+ count);

        }

    }
}
