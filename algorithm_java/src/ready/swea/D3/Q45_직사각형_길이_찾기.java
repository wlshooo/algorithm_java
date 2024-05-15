package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q45_직사각형_길이_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int fCount = 1;
            int sCount = 0;
            for (int i = 1; i < 3; i++) {
                if (array[i] == array[0]) {
                    fCount++;
                } else {
                    sCount++;
                }
            }

            if (fCount < sCount) {
                System.out.println("#" + tc + " " + array[0]);
            } else {
                System.out.println("#"+tc+" "+array[array.length-1]);
            }
        }
    }
}
