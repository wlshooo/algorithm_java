package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q87_문제_제목_붙이기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int [] alpha = new int[26];
            int count =0;
            for (int j = 0; j < N; j++) {
                char c = br.readLine().charAt(0);
                alpha[(int) c - 65]++;
            }
            System.out.print("#"+i+" ");
            for (int i1 : alpha) {
                if (i1 != 0) {
                    count++;
                } else if (i1==0){
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
