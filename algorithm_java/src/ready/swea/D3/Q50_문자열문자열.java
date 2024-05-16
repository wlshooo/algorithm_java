package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q50_문자열문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int mid = N / 2;
            boolean isCheck = true;
            String[] split = br.readLine().split("");
            if (N % 2 == 1) {
                System.out.println("#" + i + " " + "No");
                continue;
            }
            for (int j = 0; j < mid; j++) {
                if (!split[j].equals(split[j + mid])) {
                    isCheck = false;
                    break;
                }
            }
            if (isCheck) {
                System.out.println("#" + i + " " + "Yes");
            } else {
                System.out.println("#" + i + " " + "No");
            }
        }
    }
}
