package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10_초심자의_회문_검사 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String word = br.readLine().trim();
            System.out.println("#" + tc + " " + palindromeCheck(word));
        }
    }

    static int palindromeCheck(String word) {
        int length = word.length() / 2;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) != (word.charAt(word.length() - 1 - i))) return 0;
        }
        return 1;
    }
}
