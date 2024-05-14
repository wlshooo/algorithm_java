package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q29_민석이의_과제_체크하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]);
            int K = Integer.parseInt(split[1]);

            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(array);

            int[] answer = new int[N - K];

            int answerIndex = 0;
            int arrayIndex = 0;
            for (int i = 1; i <= N; i++) {
                if (array[arrayIndex] != i) {
                    answer[answerIndex] = i;
                    answerIndex++;
                    if (answerIndex == answer.length) break;
                } else {
                    arrayIndex++;
                }

                if (arrayIndex >= array.length) arrayIndex = array.length - 1;
            }

            Arrays.sort(answer);
            System.out.print("#" + tc + " ");
            for (int i : answer) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
