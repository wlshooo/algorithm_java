package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q21_삼성시의_버스_노선 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            String[] busRoute = new String[N];

            for (int i = 0; i < N; i++) {
                busRoute[i] = br.readLine();
            }
            int P = Integer.parseInt(br.readLine());
            int[] result = new int[P];

            for (int i = 0; i < P; i++) {
                int testCase = Integer.parseInt(br.readLine());
                int count = 0;
                for (int j = 0; j < N; j++) {
                    int[] array = Arrays.stream(busRoute[j].split(" ")).mapToInt(Integer::parseInt).toArray();
                    Arrays.sort(array);
                    if (testCase >= array[0] && testCase <= array[1]) {
                        count++;
                    }
                }
                result[i] = count;
            }
            System.out.print("#" + tc+" ");
            for (int i : result) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
