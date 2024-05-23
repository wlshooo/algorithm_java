package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q75_보충학습과_평균 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {

            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int sum=0;

            for (int j = 0; j < array.length; j++) {
                if (array[j] < 40) {
                    array[j] = 40;
                }
                sum+=array[j];
            }
            System.out.println("#"+i+" "+(sum/5));
        }
    }
}
