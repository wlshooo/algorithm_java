package boj.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//S1
public class Q14889_스타트와_링크 {
    static int[][] map;
    static int N;
    static int min;

    static ArrayList<Integer> teamA;
    static ArrayList<Integer> teamB;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        min = Integer.MAX_VALUE;
        teamA = new ArrayList<>();
        teamB = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = array[j];
            }
        }

        int teamNumber = N/2;
        dfs(0, teamNumber);

        System.out.println(min);
    }

    static void dfs(int order, int teamNumber) {

        if (teamNumber == 0) {
            for (int i = 0; i < N; i++) {
                if (!teamA.contains(i)) {
                    teamB.add(i);
                }
            }
            checkScore();
            teamB.clear();
            return;
        }

        for (int i = order; i < N; i++) {
            teamA.add(i);
            dfs(i + 1, teamNumber - 1);
            teamA.remove(teamA.size()-1);
        }
    }
    static void checkScore() {
        int teamA_score = 0;
        int teamB_score = 0;
        for (int i = 0; i < N / 2 - 1; i++) {
            for (int j = i + 1; j < N / 2; j++) {
                int teamA_first = teamA.get(i);
                int teamA_second = teamA.get(j);
                teamA_score += map[teamA_first][teamA_second] + map[teamA_second][teamA_first];

                int teamB_first = teamB.get(i);
                int teamB_second = teamB.get(j);
                teamB_score += map[teamB_first][teamB_second] + map[teamB_second][teamB_first];
            }
        }
        min = Math.min(min, Math.abs(teamA_score- teamB_score));
    }
}
