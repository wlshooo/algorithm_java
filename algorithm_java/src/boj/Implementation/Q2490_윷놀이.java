package boj.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//b3
public class Q2490_윷놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int z = 0;
            int o = 0;
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("0")) {
                    z++;
                } else {
                    o++;
                }
            }

            if (z == 1 && o == 3) {
                System.out.println("A");
            } else if (z == 2 && o == 2) {
                System.out.println("B");
            } else if (z == 3 && o == 1) {
                System.out.println("C");
            } else if (z == 4 && o == 0) {
                System.out.println("D");
            } else if (z == 0 && o == 4) {
                System.out.println("E");
            }
        }
    }
}
