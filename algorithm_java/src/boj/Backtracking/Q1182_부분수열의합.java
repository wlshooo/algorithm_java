package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//S2
public class Q1182_부분수열의합 {
    static int N;
    static int S;
    static int[] array;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = input[0];
        S = input[1];
        result = 0;
        array  = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        dfs(0,0);

        if (S == 0) {
            System.out.println(result - 1);
        } else {
            System.out.println(result);
        }

    }
    static void dfs(int index, int sum) {
//        System.out.println("index = " + index + "start");
//        System.out.println("index = " + index + "의 sum =" + sum);
        if (index == N) {
            if (sum == S) {
                result++;
            }
            return;
        }

        dfs(index+1, sum+array[index]);
        dfs(index+1, sum);

//        System.out.println("index = " + index + "end");
    }
}
