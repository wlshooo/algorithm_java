package ready.swea.D3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q65_새샘이와_세_소수_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int cnt = 0;
            ArrayList<Integer> list = new ArrayList<>();

            //에라토스테네스의 체 활용
            for (int i = 2; i <= n; i++) {
                int flag = 0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                //소수만 list에 담는다
                if (flag == 0)
                    list.add(i);
            }

            //3중 for문을 활용하여 3개의 소수 합이 n이 되는지 확인
            for (int i = 0; i < list.size(); i++) {
                for (int j = i; j < list.size(); j++) {
                    if (list.get(i) + list.get(j) >= n)
                        break;
                    for (int k = j; k < list.size(); k++) {
                        int sum = list.get(i) + list.get(j) + list.get(k);

                        if (sum == n) {
                            cnt++;
                        }
                    }
                }
            }

            System.out.println("#" + t + " " + cnt);
        }
    }
}
