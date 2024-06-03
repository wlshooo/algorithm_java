package boj.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//b3
public class Q2884_알람_시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int H = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        if (M >= 45) {
            M -= 45;
        } else {
            if (H == 0) {
                H=24;
            }
            H-=1;
            M+=15;
        }

        System.out.println(H+" "+M);
    }
}
