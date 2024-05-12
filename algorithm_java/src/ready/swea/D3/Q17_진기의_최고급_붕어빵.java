package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q17_진기의_최고급_붕어빵 {
    static int N;
    static int M;
    static int K;
    static int[] guestArrivalTime;
    static int currentBread;
    static String result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringBuffer sb = new StringBuffer();
            result = "Impossible";
            int[] firstLineInput = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            N = firstLineInput[0];  //손님 수
            M = firstLineInput[1];  //붕어빵 생성 시간
            K = firstLineInput[2];  //만들어지는 붕어빵 개수
            int index = 0;

            boolean isPossible = true;
            currentBread = 0;
            guestArrivalTime = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(guestArrivalTime);

            if (guestArrivalTime[0] == 0) {
                isPossible = false;
            } else {
                for (int time = 1; time <= guestArrivalTime[guestArrivalTime.length - 1]; time++) {
                    int arrivalTime = guestArrivalTime[index];
                    if (time % M == 0) {
                        currentBread += K;
                    }
                    if (index < N) {
                        if (time == arrivalTime) {
                            index++;
                            if (currentBread >= 1) {
                                currentBread -= 1;
                            } else {
                                isPossible = false;
                                break;
                            }
                        }
                    }
                }
            }

            if (isPossible) result = "Possible";
            sb.append("#").append(tc).append(" ").append(result + "\n");

            System.out.print(sb);
        }
    }
}
