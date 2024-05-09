package ready.swea.D3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_최대_상금_ {
    static String[] arr;
    static int chance;
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            max = 0;
            String[] split = br.readLine().split(" ");
            arr = split[0].split("");
            chance = Integer.parseInt(split[1]);

            //숫자의 길이면 모든 경우 탐색 가능*****
            if (chance > arr.length) {
                chance = arr.length;
            }

            dfs(0,0);

            System.out.println("#"+tc+" " +max);
        }

    }

    static void dfs(int start, int depth) {
        if (depth == chance) {
            String ansStr = "";
            for (String s : arr) {
                ansStr+=s;
            }
            max = Math.max(max,Integer.parseInt(ansStr));
            return;
        }

        for (int i = start; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                swap(i,j);
                dfs(i,depth+1);
                swap(i,j);
            }
        }
    }
    static void swap(int i,int j) {
        String temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
}
