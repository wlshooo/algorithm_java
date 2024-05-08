package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q19_쉬운_거스름돈 {
    static int[] type;
    static int[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int money = Integer.parseInt(br.readLine());
            type = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};
            count = new int[type.length];

            solve(money);

            System.out.println("#" + tc);
            ;
            for (int i : count) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void solve(int money) {
        for (int i = 0; i < type.length; i++) {
            if (money >= type[i]) {
                int share = money / type[i];
                money -= type[i] * share;
                count[i] += share;
            }
        }

    }
}
