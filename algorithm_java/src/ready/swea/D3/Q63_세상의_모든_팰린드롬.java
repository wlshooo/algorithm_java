package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q63_세상의_모든_팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String original = br.readLine();

            String reversString = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                reversString += original.charAt(i);
            }

            boolean isCheck = true;
            for (int i = 0; i < original.length(); i++) {
                if (original.charAt(i) != reversString.charAt(i)) {
                    if (original.charAt(i) != '?' && reversString.charAt(i) != '?') {
                        isCheck = false;
                        break;
                    }
                }
            }
            if (isCheck) {
                System.out.println("#" + tc + " " + "Exist");
            } else {
                System.out.println("#" + tc + " " + "Not exist");
            }
        }
    }
}
