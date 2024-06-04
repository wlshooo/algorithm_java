package boj.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//s4
public class Q3048_개미_ {
    static ArrayList<Ant> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        String s1 = br.readLine();
        String s2 = br.readLine();
        int T = Integer.parseInt(br.readLine());

        for (int i = s1.length() - 1; i >= 0; i--) {
            list.add(new Ant(s1.charAt(i), 1));
        }

        for (int i = 0; i < s2.length(); i++) {
            list.add(new Ant(s2.charAt(i), 2));
        }

        while (T-- > 0) {
            for (int i = 0; i < list.size() - 1; i++) {
                Ant now = list.get(i);
                Ant next = list.get(i + 1);
                if (now.num != next.num) {
                    list.set(i, next);
                    list.set(i + 1, now); // SWAP
                    i++;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).ch);
        }

    }

    public static class Ant {

        char ch;
        int num;

        public Ant(char ch, int num) {
            this.ch = ch;
            this.num = num;
        }
    }
}
