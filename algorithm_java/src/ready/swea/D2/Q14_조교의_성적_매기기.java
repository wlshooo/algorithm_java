package ready.swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q14_조교의_성적_매기기 {
    static Map<Integer, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            map = new HashMap<>();
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]);
            int K = Integer.parseInt(split[1]);
            int[] scoreArr = new int[N];

            for (int i = 0; i < N; i++) {
                int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int score = calScore(array[0], array[1], array[2]);
                scoreArr[i] =score;
                map.put(score,i);
            }

            Arrays.sort(scoreArr);

            for (int i = 0; i < scoreArr.length; i++) {
                if (map.get(scoreArr[i]) == K - 1) {
                    printGrade(i,N,tc);
                }
            }

        }
    }
    static int calScore(int mid, int fin, int assign) {
       return (mid * 35) + (fin * 45) + (assign * 20);
    }

    static void printGrade(int index, int N, int tc) {
        int maxGradeCount = N / 10;
        int i = index + 1;
        String grade;

        if (i <= N) {
            int remainingStudents = N - i + 1;
            int gradeIndex = (remainingStudents - 1) / maxGradeCount;

            switch (gradeIndex) {
                case 0:
                    grade = "A+";
                    break;
                case 1:
                    grade = "A0";
                    break;
                case 2:
                    grade = "A-";
                    break;
                case 3:
                    grade = "B+";
                    break;
                case 4:
                    grade = "B0";
                    break;
                case 5:
                    grade = "B-";
                    break;
                case 6:
                    grade = "C+";
                    break;
                case 7:
                    grade = "C0";
                    break;
                case 8:
                    grade = "C-";
                    break;
                default:
                    grade = "D0";
                    break;
            }
        } else {
            grade = "D0";
        }

        System.out.println("#" + tc + " " + grade);
    }


}
