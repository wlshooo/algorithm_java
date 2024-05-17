package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q64_순열1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            boolean isCheck = true;
            for (int i : array) {
                if (arr[i - 1] != 0) {
                    isCheck = false;
                    break;
                } else {
                    arr[i - 1]++;
                }
            }
            if (isCheck) {
                System.out.println("#" + tc + " " + "Yes");
            } else {
                System.out.println("#" + tc + " " + "No");
            }

        }
    }
}
