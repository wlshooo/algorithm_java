package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q73_태혁이의_사랑은_타이밍 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int dateTime = 3600 * 24 * 10 + 11 * 3600 + 11 * 60;

            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int day = array[0];
            int hour = array[1];
            int min = array[2];

            int currentTime = (day-1) * 3600 * 24 + hour * 3600 + min * 60;

            if (dateTime > currentTime) {
                System.out.println("#" + i + " " + (-1));
            } else {
                System.out.println("#"+i+" "+((currentTime - dateTime)/60));
            }
        }
    }
}
