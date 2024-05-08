package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q21_간단한_압축_풀기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int number = Integer.parseInt(br.readLine());
            String string = "";

            for (int i = 0; i < number; i++) {
                String[] split = br.readLine().split(" ");
                String s = split[0];
                int count = Integer.parseInt(split[1]);

                for (int j = 0; j < count; j++) {
                    string+=s;
                }
            }

            System.out.println("#"+tc);
            for (int i = 0; i < string.length(); i++) {
                if(i!=0 && i%10==0) System.out.println();
                System.out.print(string.charAt(i));
            }
            System.out.println();
        }
    }
}
