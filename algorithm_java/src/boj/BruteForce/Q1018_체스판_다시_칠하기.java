package boj.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//s4
public class Q1018_체스판_다시_칠하기 {
    static String[][] arr;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        arr = new String[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(s.charAt(j));
            }
        }
        String[][] temp = new String[8][8];
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        temp[k][l] = arr[i+k][j+l];
                    }
                }
                int blackBasedChessBoardCount = blackBasedChessBoardCount(temp);
                min = Math.min(min, Math.min(blackBasedChessBoardCount, 64-blackBasedChessBoardCount));
            }
        }

        System.out.println(min);

    }

    static int blackBasedChessBoardCount(String[][] chessBoard) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        if (chessBoard[i][j].equals("W")) count++;
                    } else {
                        if (chessBoard[i][j].equals("B")) count++;
                    }
                } else {
                    if (j % 2 == 0) {
                        if (chessBoard[i][j].equals("B")) count++;
                    } else {
                        if (chessBoard[i][j].equals("W")) count++;
                    }
                }
            }
        }
        return count;
    }
//  블랙 기반 체스판 카운트와 화이트 기반 체스판은 정확히 반대의 결을 가지고 있기때문에
//  min = Math.min(min, Math.min(blackBasedChessBoardCount, 64-blackBasedChessBoardCount));
//  으로 빼주면 화이트 기반 체스판의 불필요한 계산이 필요 없다

//    static int whiteBasedChessBoardCount(String[][] chessBoard) {
//        int count = 0;
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (i % 2 == 0) {
//                    if (j % 2 == 0) {
//                        if (chessBoard[i][j].equals("B")) count++;
//                    } else {
//                        if (chessBoard[i][j].equals("W")) count++;
//                    }
//                } else {
//                    if (j % 2 == 0) {
//                        if (chessBoard[i][j].equals("W")) count++;
//                    } else {
//                        if (chessBoard[i][j].equals("B")) count++;
//                    }
//                }
//            }
//        }
//        return count;
//    }
}
