package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Q17_Base64_Decoder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String encoder = br.readLine();
            String s = new String(Base64.getDecoder().decode(encoder));
            System.out.println("#"+tc+" "+s);
        }
    }
}
