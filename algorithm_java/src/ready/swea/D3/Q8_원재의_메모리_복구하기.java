package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q8_원재의_메모리_복구하기 {
    static int[] originBit;
    static int[] temp;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split("");
            originBit = new int[split.length];
            count = 0;
            temp = new int[originBit.length];

            for (int i = 0; i < split.length; i++) {
                originBit[i] = Integer.parseInt(split[i]);
            }

            recovery();
            System.out.println("#" + tc + " " + count);
        }
    }

    static void recovery() {
        int index = 0;
        while (!compare()) {
            if (temp[index] != originBit[index]) {
                if (temp[index] == 1) {
                    for (int i = index; i < temp.length; i++) {
                        temp[i] = 0;
                    }
                    count++;
                } else {
                    for (int i = index; i < temp.length; i++) {
                        temp[i] = 1;
                    }
                    count++;
                }


            }
            index++;
        }
    }


    static boolean compare() {
        return Arrays.equals(temp, originBit);
    }
}
