package boj.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//b1
public class Q10798_세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < split.length; j++) {
                arr[i][j] = split[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i]==null) continue;
                System.out.print(arr[j][i]);
            }
        }
    }
}
