package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q16_새로운_불면증_치료법 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] checkArr = new int[10];
            int index = 1;
            int temp = N;
            while (!verification(checkArr)) {
                String[] split = String.valueOf(temp).split("");
                for (String s : split) {
                    checkArr[Integer.parseInt(s)]++;
                }
                temp = N;
                index++;
                temp = temp * index;
            }
            System.out.println("#"+tc+" "+(N* (index-1)));
        }
    }

    static boolean verification(int[] checkArr) {
        for (int i : checkArr) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
}
