package boj.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//B3
public class Q2501_약수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = array[0];
        int K = array[1];
        int count =0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
