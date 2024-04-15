package boj.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//G5

//벽을 3개 세운다
//바이러스를 퍼트린다
//안전지역의 개수를 max값과 비교한다
public class Q14502_연구소_ {
    static int max;
    static int n;
    static int m;
    static int[][] map;


    static final int dx[] = {0,0,1,-1};  //상하좌우 방향 설정
    static final int dy[] = {1,-1,0,0};  //상화좌우 방향 설정
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        max = 0;
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            int[] readLine = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < m; j++) {
                map[i][j] = readLine[j];
            }
        }

        dfs(0);
        System.out.println(max);

    }
    static void dfs(int index) {

        if (index == 3) {
            bfs();
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                   map[i][j] =1;
                   dfs(index+1);
                   map[i][j] =0;
                }
            }
        }
    }

    static void bfs() {
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 2) {
                    queue.add(new Node(i,j));
                }
            }
        }

        int[][] copyMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            copyMap[i] = map[i].clone();
        }

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;

            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (copyMap[nx][ny] == 0) {
                        copyMap[nx][ny] = 2;
                        queue.add(new Node(nx, ny));
                    }
                }
            }
        }
        int safeCount = safeZoneCount(copyMap);
        max = Math.max(max, safeCount);
    }

    static int safeZoneCount(int[][] copyMap) {
        int count = 0;
        for (int[] ints : copyMap) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
