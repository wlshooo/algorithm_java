package ready.swea.D3;

import java.util.Scanner;

public class Q11_거듭_제곱 {
    static int T;
    static int N;
    static int M;
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            T = sc.nextInt();
            N = sc.nextInt();
            M = sc.nextInt();
            answer = 1;
            cal(answer, 1);

        }
    }

    static void cal(int answer,int count) {
        if (count == M) {
            answer *= N;
            System.out.println("#" + T+" " +answer);
            return;
        }
        cal(answer * N ,count+1);
    }
}
