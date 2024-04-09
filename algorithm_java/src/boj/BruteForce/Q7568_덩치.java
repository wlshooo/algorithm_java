package boj.BruteForce;

import java.io.*;
import java.util.Arrays;

//s5
public class Q7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] people = new String[N];
        for (int i = 0; i < N; i++) {
            String information = br.readLine();
            people[i] = information;
        }

        for (int i = 0; i < people.length; i++) {
            int[] person = Arrays.stream(people[i].split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = 0;
            for (int j = 0; j < people.length; j++) {

                if(i==j) continue;

                int[] other = Arrays.stream(people[j].split(" ")).mapToInt(Integer::parseInt).toArray();
                if(other[0] > person[0] && other[1] > person[1]) count++;
            }
            count+=1;
            if (i != people.length - 1) {
                System.out.print(count + " ");
            } else {
                System.out.print(count);
            }
        }


    }
}
