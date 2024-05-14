package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q26_의석이의_세로로_말해요 {
    static int maxLength;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            String[][] arr = new String[5][15];
            maxLength = 0;
            for (int i = 0; i < 5; i++) {

                String[] string = br.readLine().split("");
                for (int j = 0; j < string.length; j++) {
                    arr[i][j] = string[j];
                }
                maxLength = Math.max(string.length, maxLength);
            }

            String answer = "";
            for (int i = 0; i < maxLength; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[j][i] == null) {
                        answer += "";
                    } else {
                        answer+=arr[j][i];
                    }
                }
            }
            System.out.println("#"+tc+" "+answer);
        }
    }
}
