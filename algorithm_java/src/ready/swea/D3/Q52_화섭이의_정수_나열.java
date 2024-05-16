package ready.swea.D3;

import java.io.IOException;
import java.util.Scanner;

public class Q52_화섭이의_정수_나열 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            int N = scan.nextInt();
            String str = "";

            // 입력받은 숫자를 문자열로 붙여서 만들기.
            for (int i = 0; i < N; i++) {
                str += Integer.toString(scan.nextInt());
            }

            // i의 값을 String으로 변환후, 위에서 이어붙인 str에 포함되지 않을경우 -> 가장 작은 정수
            for (int i = 0; ; i++) {
                if (!str.contains(Integer.toString(i))) {
                    System.out.println("#" + tc + " " + i);
                    break;
                }
            }
        }
        scan.close();
    }
}


