package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Q86_늘어지는_소리_만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String[] split = br.readLine().split("");
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < split.length; j++) {
                list.add(split[j]);
            }

            int N = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(array);
            for (int j = 0; j < N; j++) {
                list.add(array[j]+j,"-");
            }
            System.out.print("#"+i+" ");
            for (String s : list) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
