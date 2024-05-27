package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Q79_코딩_토너먼트_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            LinkedList<Integer> list = new LinkedList<>();
            int sum = 0;

            for (int i1 : array) {
                list.add(i1);
            }


            while (list.size() >= 2) {
                int indexZero = list.poll();
                int indexOne = list.poll();
                int max = Math.max(indexZero,indexOne);
                int min = Math.min(indexOne,indexZero);
                sum+= max-min;
                list.add(max);
            }
            System.out.println("#"+i+" "+sum);
        }
    }
}
