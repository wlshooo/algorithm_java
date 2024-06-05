package ready.swea.D3;

import java.io.*;

public class Q83_N_QUEEN {
    static int board[]; // 퀸의 위치를 담는다. (board[0]=1 -> (0,1)에 하나의 퀸이 있다.)
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int num;

        for (int i = 1; i <= n; i++) {
            num = Integer.parseInt(br.readLine());
            board = new int[num];
            answer = 0;
            countNQueenCase(num, 0);
            System.out.println("#" + i + " " + answer);
        }
    }

    public static void countNQueenCase(int n, int curr) {
        boolean isPossible;        //놓을 수 있는가
        if (curr == n) {        //모든 퀸을 놓은 경우
            answer++;
            return;
        }
        for (int i = 0; i < n; i++) {        // [curr][i]에 퀸을 놓을 수 있는지 확인
            isPossible = true;
            for (int j = 0; j < curr; j++) {

                /*
                board[j] == i  : 위에서 놓은 퀸이 있는 직선이기에 이 열은 다른 퀸을 놓을 수 없다.
                i == board[j]+(curr - j) : 위에서 놓은 퀸의 오른쪽 대각선이 현재 행의 i를 지나가기에 다른 퀸을 놓을 수 없다.
                i == board[j]-(curr - j) : 위에서 놓은 퀸의 왼쪽 대각선이 현재 행의 i를 지나가기에 다른 퀸을 놓을 수 없다.

                 */
                if (board[j] == i || i == board[j] + (curr - j) || i == board[j] - (curr - j)) {        //직선, 대각선 확인
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                board[curr] = i;
                countNQueenCase(n, curr + 1);
            }
        }
    }
}
