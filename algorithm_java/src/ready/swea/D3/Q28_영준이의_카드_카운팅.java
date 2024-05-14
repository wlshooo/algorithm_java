package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q28_영준이의_카드_카운팅 {
    static int[][] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            boolean isCheck = false;
            cards = new int[4][13];

            String[] split = br.readLine().split("");

            for (int i = 0; i < split.length; i += 3) {
                if (split[i].equals("S")) {
                    int num = Integer.parseInt(split[i + 1] + split[i + 2]);
                    if (cards[0][num - 1] != 0) {
                        isCheck = true;
                        break;
                    }
                    cards[0][num - 1]++;
                } else if (split[i].equals("D")) {
                    int num = Integer.parseInt(split[i + 1] + split[i + 2]);
                    if (cards[1][num - 1] != 0) {
                        isCheck = true;
                        break;
                    }
                    cards[1][num - 1]++;
                } else if (split[i].equals("H")) {
                    int num = Integer.parseInt(split[i + 1] + split[i + 2]);
                    if (cards[2][num - 1] != 0) {
                        isCheck = true;
                        break;
                    }
                    cards[2][num - 1]++;
                } else if (split[i].equals("C")) {
                    int num = Integer.parseInt(split[i + 1] + split[i + 2]);
                    if (cards[3][num - 1] != 0) {
                        isCheck = true;
                        break;
                    }
                    cards[3][num - 1]++;
                }
            }
            if (isCheck) {
                System.out.println("#" + tc + " " + "ERROR");
                continue;
            }
            int[] result = new int[4];
            for (int i = 0; i < 13; i++) {
                if (cards[0][i] == 0) result[0]++;
                if (cards[1][i] == 0) result[1]++;
                if (cards[2][i] == 0) result[2]++;
                if (cards[3][i] == 0) result[3]++;
            }
            System.out.print("#" + tc + " ");
            for (int r : result) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
