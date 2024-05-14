package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24_퍼펙트_셔플 {
    static String[] arr;
    static String[] answer;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            answer = new String[N];
            arr = br.readLine().split(" ");

            perfectShuffle(tc);
        }
    }

    static void perfectShuffle(int tc) {
        int leftIndex;

        int rightIndex;

        if (arr.length % 2 == 0) {
            leftIndex = 0;
            rightIndex = arr.length / 2;
        } else {
            leftIndex = 0;
            rightIndex = arr.length / 2 + 1;
        }

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                answer[i] = arr[leftIndex];
                leftIndex++;
            } else {
                answer[i] = arr[rightIndex];
                rightIndex++;
            }
        }
        System.out.print("#" + tc + " ");
        for (String s : answer) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

