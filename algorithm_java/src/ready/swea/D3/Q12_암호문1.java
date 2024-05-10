package ready.swea.D3;

import java.awt.image.IndexColorModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12_암호문1 {
    static int N;
    static List<Integer> originalCiphertext;
    static int commandNum;
    static String[][] command;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            N = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            originalCiphertext = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                originalCiphertext.add(array[i]);
            }
            commandNum = Integer.parseInt(br.readLine());
            String[] split = br.readLine().split(" ");

            for (int i = 0; i < split.length;) {
                if (split[i].equals("I")) {
                    int x = Integer.parseInt(split[i + 1]);
                    int y = Integer.parseInt(split[i + 2]);

                    for (int j = i + 3; j < i + 3 + y; j++) {
                        originalCiphertext.add(x++, Integer.parseInt(split[j]));
                    }
                    i=i+2+y+1;
                }
            }
            System.out.print("#" + tc + " ");
            for (int i = 0; i < 10; i++) {
                System.out.print(originalCiphertext.get(i)+" ");
            }
            System.out.println();
        }
    }
}
