package boj.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//s4
public class Q1065_한수 {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count =0;
        int T = Integer.parseInt(br.readLine());

        if (T < 100) {
            System.out.println(T);
        } else {
            addCount(T);
            System.out.println(count + 99);
        }
    }

    static void addCount(int number) {
        for (int i = 100; i <= number; i++) {
            if(calNumber(i)) count++;
        }
    }
    static boolean calNumber(int number) {
        String[] splitNumber = String.valueOf(number).split("");
        int gap = Integer.parseInt(splitNumber[1]) - Integer.parseInt(splitNumber[0]);
        for (int i = splitNumber.length-1; i > 0; i--) {
            if (Integer.parseInt(splitNumber[i]) - Integer.parseInt(splitNumber[i - 1]) != gap) {
                return false;
            }
        }
        return true;
    }
}
