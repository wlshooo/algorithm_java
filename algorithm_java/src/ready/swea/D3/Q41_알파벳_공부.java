package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q41_알파벳_공부 {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            count = 0;
            String string = br.readLine();
            char c = 'a';
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == c) {
                    count++;
                    c += 1;
                } else {
                    break;
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }

}
