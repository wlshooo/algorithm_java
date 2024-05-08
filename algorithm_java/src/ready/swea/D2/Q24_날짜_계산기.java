package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q24_날짜_계산기 {
    static int[] days ={31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int fm = array[0];
            int fd = array[1];
            int sm = array[2];
            int sd = array[3];
            int firstSum = 0;
            int secondSum = 0;
            for (int i = 0; i < sm - 1; i++) {
                if(fm-1>= i+1) firstSum+= days[i];
                secondSum+=days[i];
            }
            firstSum+=fd;
            secondSum+=sd;

            System.out.println("#"+tc+" " + (secondSum-firstSum + 1));
        }

    }
}
