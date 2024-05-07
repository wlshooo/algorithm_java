package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2_최빈수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= N; tc++) {
            int max = 0;
            int maxScore = 0;
            int[] score = new int[101];
            int tcNum = Integer.parseInt(br.readLine());
            int[] studentScore = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i : studentScore) {
                score[i]++;
            }

            for (int i = 0; i < score.length; i++) {
                if (max <= score[i]) {
                    max = score[i];
                    maxScore = i;
                }
            }

            System.out.println("#"+tc+" "+ maxScore);

        }
    }
}
