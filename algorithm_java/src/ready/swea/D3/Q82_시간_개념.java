package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q82_시간_개념 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] ct = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
            int[] at = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();

            int currentTime = 3600 * ct[0] + 60 * ct[1] + ct[2];
            int appointmentTime = 3600 * at[0] + 60 * at[1] + at[2];

            if (appointmentTime < currentTime) {
                appointmentTime+=3600*24;
            }
            int s = appointmentTime-currentTime;
            String hour = String.valueOf(s/3600);
            String min = String.valueOf((s%3600)/60);
            String sec = String.valueOf((s%3600)%60);

            if (hour.length() == 1) {
                hour="0"+hour;
            }
            if (min.length() == 1) {
                min="0"+min;
            }
            if (sec.length() == 1) {
                sec="0"+sec;
            }
            System.out.println("#"+i+" "+hour+":"+min+":"+sec);
        }
    }
}
