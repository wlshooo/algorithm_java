package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1_백만_장자_프로젝트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 1; i <= tc; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            long answer = 0;
            int index =N-1;
            int max = array[index];

            for (int j = index - 1; j >= 0; j--) {
                if (max < array[j]) {
                    max = array[j];
                } else {
                    answer+=max-array[j];
                }
            }
            System.out.println("#"+i+" "+answer);

        }
    }
}
