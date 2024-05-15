package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q38_쥬스_나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.print("#"+i+" ");
            for (int j = 0; j < N; j++) {
                System.out.print(1+"/"+N+" ");
            }
            System.out.println();
        }
    }
}
