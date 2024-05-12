package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q20_GNS {
    static String[] strings = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
    static Map<String,Integer> stringToInteger;
    static Map<Integer,String> integerToString;
    static int[] intArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] split = br.readLine().split(" ");
            String testNumber = split[0];
            int N = Integer.parseInt(split[1]);
            stringToInteger = new HashMap<>();
            integerToString = new HashMap<>();
            intArr = new int[N];

            String[] input = br.readLine().split(" ");

            for (int i = 0; i < 10; i++) {
                stringToInteger.put(strings[i],i);
                integerToString.put(i,strings[i]);
            }

            for (int i = 0; i < N; i++) {
                intArr[i] = stringToInteger.get(input[i]);
            }
            Arrays.sort(intArr);

            System.out.println(testNumber);
            for (int i = 0; i < N; i++) {
                System.out.print(integerToString.get(intArr[i])+" ");
            }
            System.out.println();
        }
    }
}
