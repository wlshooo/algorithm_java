package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q37_이진수_표현 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int N = array[0];
            long M = array[1];
            boolean isCheck = true;
            String binaryString = Long.toBinaryString(M);
            for (int i = binaryString.length() - 1; i >= binaryString.length() - N; i--) {
                if (i < 0 || binaryString.charAt(i) == '0') {
                    isCheck = false;
                    break;
                }
            }
            if (isCheck) {
                System.out.println("#" + tc + " " + "ON");
            } else {
                System.out.println("#" + tc + " " + "OFF");
            }
        }
    }
}
