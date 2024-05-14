package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27_유효숫자_표기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            boolean addIndex = false;
            String split = br.readLine();
            String ns = split.charAt(0) + "." + split.substring(1);
            String[] arr = ns.split("");

            if (Integer.parseInt(arr[3]) > 4) {
                arr[2] = String.valueOf(Integer.parseInt(arr[2]) + 1);
                if (Integer.parseInt(arr[2]) == 10) {
                    arr[2] = "0";
                    arr[0] = String.valueOf(Integer.parseInt(arr[0]) + 1);
                    if (Integer.parseInt(arr[0]) == 10) {
                        arr[0] = "1";
                        addIndex = true;
                    }
                }
            }
            if (addIndex) {
                System.out.println("#" + tc + " " + arr[0] + arr[1] + arr[2] + "*10^" + (arr.length - 1));
            } else {
                System.out.println("#" + tc + " " + arr[0] + arr[1] + arr[2] + "*10^" + (arr.length - 2));
            }

        }
    }
}
