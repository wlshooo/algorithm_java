package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q47_교환학생 {
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] calender = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            min = Integer.MAX_VALUE;
            for (int i = 0; i < calender.length; i++) {
                if (calender[i] == 1) {
                    int start = i;
                    int count = 0;
                    while (true) {
                        if (calender[start % 7] == 1) count++;
                        start++;

                        if (count == N) {
                            min = Math.min(min, (start - i));
                            break;
                        }
                    }
                }
            }

            System.out.println("#" + tc + " " + min);
        }
    }
}
