package boj.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//S1
public class Q14888_연산자_끼워넣기_ {
    static int[] sequence;
    static int[] operator;
    static int N;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        sequence = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        operator = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        dfs(sequence[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int num, int idx) {
        if (idx == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            // 연산자 개수가 1개 이상인 경우
            if (operator[i] > 0) {

                // 해당 연산자를 1 감소시킨다.
                operator[i]--;

                switch (i) {

                    case 0:
                        dfs(num + sequence[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - sequence[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * sequence[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / sequence[idx], idx + 1);
                        break;

                }
                // 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
                operator[i]++;
            }
        }
    }
}
