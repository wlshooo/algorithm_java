package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q14_비밀번호 {
    static int N;
    static String arr;
    static String answer;
    static List<Character> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            String[] split = br.readLine().split(" ");
            N = Integer.parseInt(split[0]);
            arr = split[1];
            list = new ArrayList<>();
            answer = "";

            for (int i = 0; i < arr.length(); i++) {
                list.add(arr.charAt(i));
            }
            findPassword();

            System.out.println("#" + tc + " " + answer);
        }
    }

    static void findPassword() {
        if (list.size() == 1) return;
        boolean isCheck = false;
        for (int i = 0; i < list.size() - 1; i++) {
            Character f = list.get(i);
            Character s = list.get(i + 1);
            if (f.equals(s)) {
                list.remove(i);
                list.remove(i);
                isCheck = true;
                break;
            }
        }
        if (isCheck) {
            findPassword();
        } else {
            for (Character c : list) {
                answer+=c;
            }
        }
    }
}

