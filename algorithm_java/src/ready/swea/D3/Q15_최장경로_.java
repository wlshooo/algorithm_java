package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//최장경로
public class Q15_최장경로_ {
    static int Tc;   // Tc
    static int N, M; // N - 정점의 개수, M - 간선의 개수
    static ArrayList<Integer>[] start;
    static int answer;
    static boolean[] visited ;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Tc = Integer.parseInt(br.readLine());

        for( int tc = 1; tc<=Tc; tc++) {

            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken()); // 정점 수
            M = Integer.parseInt(st.nextToken()); // 간선 수
            answer =  1;

            start  = new ArrayList[N]; // 각 노드에 연결된 정점들
            visited = new boolean[N];  // 노드 방문 여부

            for( int i=0; i<N; i++) {
                start[i] = new ArrayList<>();
            }


            // 1. arraylist에 연결된 정점 저장
            for( int i=0; i< M; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int from = Integer.parseInt(st.nextToken()) -1 ;  // 시작 정점
                int to = Integer.parseInt(st.nextToken()) - 1 ; // 도착 정점

                start[from].add(to);
                start[to].add(from);
            }

            // 2. 연결된 정점 모두 타고 들어가면서, dfs
            for( int Strt=0; Strt< N; Strt++) {
                visited[Strt] = true;
                dfs(Strt, 1, 0);
                visited[Strt] = false;

            }
            // 2-1.

            // 3. 가장 depth 긴것,

            System.out.println("#"+tc+" "+answer);
        }
    }
    private static void dfs(int startNode, int step, int depth) {
        answer = Math.max( step , answer);

        // base rule
        if ( depth == N ) return;

        // 연결된 노드 타고 들어가자.
        for( int to = 0; to< start[startNode].size(); to++) {

            int target = start[startNode].get(to);
            if ( visited[ target ] ) continue; // 방문한 곳이면 가지말고

            // 처음 보는 곳이면
            visited[ target ]  = true; // 방문처리하고
            dfs( target, step+1, depth+1); // dfs
            visited[ target ] = false;

        }
    }
}
