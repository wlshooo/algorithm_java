package ready.swea.D3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q70_최고의_쌍_ {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int N;
        String[] arr;
        int [] arrNum, muti;

        for (int i = 1; i <= T; i++) {
            N = Integer.parseInt(br.readLine());
            arr = br.readLine().split(" ");
            arrNum = new int[arr.length];
            for (int j = 0; j < N; j++) {
                arrNum[j] = Integer.parseInt(arr[j]);
            }

            int maxMulti = -1;
            for (int j = 0; j < arrNum.length - 1; j++) {
                int x = arrNum[j];
                for (int z = j + 1; z < arrNum.length; z++) {
                    int y = arrNum[z];
                    int t = x * y;
                    int num = t % 10; //일의 자리 저장 ex) 1234에서 num = 4
                    t = t / 10; //자리수 하나 줄이기 ex) 1234 -> 123
                    boolean check = true; // 연속된 수인지 체크

                    while (t > 0) {
                        if (num - 1 == t % 10) { // 일의자리와, 저장한 자리수 비교 ex) 123
                            num--;
                        } else {
                            check = false;
                            break;
                        }
                        t = t / 10; //반복을 통해 연속된 수인지 계속 체크
                    }
                    if (check && maxMulti < x * y) { //최대값 계속 체크
                        maxMulti = x * y;
                    }
                }
            }
            bw.write("#" + i + " " + maxMulti + "\n");
        }
        br.close();
        bw.close();
    }
}
