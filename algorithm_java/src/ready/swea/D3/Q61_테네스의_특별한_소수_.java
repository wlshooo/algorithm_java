package ready.swea.D3;

import java.util.Scanner;

public class Q61_테네스의_특별한_소수_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[1000001];
        for(int i = 2; i < arr.length; i++) {
            int j = 2;
            while(true) {
                if(i * j > 1000000)
                    break;
                arr[i * j] = 1;
                j++;
            }
        }

        for(int t = 1; t <= tc; t++) {
            int d = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cnt = 0;
            if(a == 1)
                a = 2;
            for(int i = a; i <= b; i++) {
                if(arr[i] == 0) {
                    String s = String.valueOf(i);
                    for(int j = 0; j < s.length(); j++) {
                        if((s.charAt(j) - '0') == d) {
                            cnt++;
                            break;
                        }
                    }
                }
            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}

