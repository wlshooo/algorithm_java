package boj.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//b1
public class Q2309_일곱_난쟁이 {
    public static void main(String[] args) throws IOException {
        int[] dwarf = new int[9];
        boolean isCheck = false;
        init(dwarf);
        int totalDwarf = 0;
        int[] suspicious = new int[2];
        for (int i : dwarf) {
            totalDwarf+=i;
        }


        for (int i = 0; i < dwarf.length; i++) {
            for (int j = 0; j < dwarf.length; j++) {
                if(i==j) continue;
                if (totalDwarf - dwarf[i] - dwarf[j] == 100) {
                    suspicious[0] = dwarf[i];
                    suspicious[1] = dwarf[j];
                    isCheck = true;
                    break;
                }
            }
            if(isCheck) break;
        }
        Arrays.sort(dwarf);
        for (int i : dwarf) {
            if(i== suspicious[0] || i==suspicious[1]) continue;
            System.out.println(i);
        }
    }

    private static void init(int[] dwarf) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < dwarf.length; i++) {
             dwarf[i] = Integer.parseInt(br.readLine());
        }
    }
}
