package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q34_안경이_없어 {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] one = {"A", "D", "O", "P", "Q", "R"};
        map.put("B", 2);
        char alpha = 'A';

        for (int i = 0; i < one.length; i++) {
            map.put(one[i], 1);
        }

        for (int i = 1; i <= 26; i++) {
            map.putIfAbsent(String.valueOf(alpha), 0);
            alpha += 1;
        }


        for (int tc = 1; tc <= T; tc++) {
            String fConvert = "";
            String sConvert = "";
            String[] split = br.readLine().split(" ");

            for (int i = 0; i < split[0].length(); i++) {
                fConvert += map.get(String.valueOf(split[0].charAt(i)));
            }
            for (int i = 0; i < split[1].length(); i++) {
                sConvert += map.get(String.valueOf(split[1].charAt(i)));
            }
            if (fConvert.equals(sConvert)) {
                System.out.println("#" + tc + " " + "SAME");
            } else {
                System.out.println("#" + tc + " " + "DIFF");
            }
        }
    }
}
