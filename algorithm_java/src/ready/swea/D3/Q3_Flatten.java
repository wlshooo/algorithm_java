package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3_Flatten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int dump = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(array);

            for (int i = 0; i < dump; i++) {
                array[array.length-1]-=1;
                array[0]+=1;
                Arrays.sort(array);
            }

            int result = array[array.length-1] - array[0];
            System.out.println("#"+tc+" " + result);
        }
    }
}
