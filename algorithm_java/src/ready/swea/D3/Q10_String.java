package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int N = Integer.parseInt(br.readLine());
            String search = br.readLine();
            String s = br.readLine();
            int answer =0;

            for (int i = 0; i < s.length() - search.length() + 1; i++) {
                String string = "";
                for (int j = i; j < i + search.length(); j++) {
                    string+=s.charAt(j);
                }
                if(search.equals(string)) answer++;
            }

            System.out.println("#" + N +" " + answer);
        }


    }
}
