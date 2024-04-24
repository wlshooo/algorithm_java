package boj.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//S3
public class Q15657_N과M_8 {
    static int N;
    static int M;
    static int[] arr;
    static int[] temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = array[0];
        M = array[1];

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        temp = new int[M];
        Arrays.sort(arr);

        dfs(0);

    }

    static void dfs(int depth) {
        if (depth == M) {
            String answer = String.valueOf(temp[0]);
            if (M == 1) {
                System.out.println(answer);
                return;
            } else {
                for (int i = 1; i < temp.length; i++) {
                    if (temp[i - 1] <= temp[i]) {
                        answer+=" " + temp[i];
                    } else {
                        return;
                    }
                }
            }
            System.out.println(answer);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
                temp[depth] = arr[i];
                dfs(depth+1);
            }
        }
    }

