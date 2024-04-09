package boj.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//s5
public class Q1436_영화감독_숌 {

    public static final String FIXED_VALUE = "666";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10000];
        int i=0;
        int count =0;
        while (count<10000) {
            i++;
            if (String.valueOf(i).contains(FIXED_VALUE)) {
                arr[count] = i;
                count++;
            }
        }
        System.out.println(arr[N-1]);
    }
}
