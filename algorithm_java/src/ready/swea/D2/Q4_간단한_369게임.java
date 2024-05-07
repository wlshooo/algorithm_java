package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4_간단한_369게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            String[] split = s.split("");
            int count =0;
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("3") || split[j].equals("6") || split[j].equals("9")) {
                    count++;
                }
            }
            if (count != 0) {
                for (int k = 0; k < count; k++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            } else {
                System.out.print(s+" ");
            }

        }
    }
}
