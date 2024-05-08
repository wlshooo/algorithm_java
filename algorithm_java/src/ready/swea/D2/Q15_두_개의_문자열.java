package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q15_두_개의_문자열 {
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            max = 0;
            int[] length = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (A.length > B.length) {
                bigA(length[0], length[1], A ,B);
            } else {
                bigB(length[0], length[1], A, B);
            }

            System.out.println("#"+tc+" " + max);
        }
    }
    static void bigA(int aLength, int bLength, int[] A, int[] B) {
        int gap = aLength - bLength;
        for (int i = 0; i <= gap; i++) {
            int sum = 0;
            for (int j = 0; j < bLength; j++) {
                sum+=A[j+i] * B[j];
            }
            max = Math.max(max,sum);
        }
    }
    static void bigB(int aLength, int bLength, int[] A, int[] B){
        int gap = bLength - aLength;
        for (int i = 0; i <= gap; i++) {
            int sum = 0;
            for (int j = 0; j < aLength; j++) {
                sum+=A[j] * B[i+j];
            }
            max = Math.max(max,sum);
        }
    }
}
