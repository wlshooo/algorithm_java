package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q59_알_덴테_스파게티 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]); //모래시계 개수
            int B = Integer.parseInt(split[1]); //면 삶는 시간
            int E = Integer.parseInt(split[2]); //오차 허용 시간
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                int current = array[i];

                for (int j = B - E; j <= B + E; j++) {
                    if (j % current == 0) {
                        count++;
                        break;
                    }
                }
            }

            System.out.println("#" + tc + " " + count);
        }

    }
}
