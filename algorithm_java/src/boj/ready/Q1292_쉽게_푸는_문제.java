package boj.ready;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//B1
public class Q1292_쉽게_푸는_문제 {
    static int index = 0;
    static int[] arr;

    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        arr = new int[1000];
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int i =1;
        while (index < 1000) {
            cal(i);
            i++;
        }
        for (int j = A-1; j <B; j++) {
            result+=arr[j];
        }

        System.out.println(result);
    }

    static void cal(int number) {
        int localIndex = index;
        for (int i = localIndex; i < localIndex + number; i++) {
            arr[index] = number;
            index++;
            if(index==1000) return;
        }
    }
}
