package ready.swea.D3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q69_팰린드롬_문제_ {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count = 0;
            HashSet<String> values = new HashSet<>();
            for(int i = 0; i < n; i++){
                String temp = sc.next();
                if(judge(temp)){
                    count = 1;
                } else {
                    values.add(temp);
                }
            }
            Iterator<String> it = values.iterator();
            while(it.hasNext()){
                String value = it.next();
                if(values.contains(value)){
                    String temp  = reverse(value);
                    if(values.contains(temp)){
                        count += 1;
                    }
                }
            }
            System.out.println("#" + test_case + " " + count * m);
        }
    }

    static private boolean judge(String value){
        for(int i =0; i < value.length() / 2; i++){
            if(value.charAt(i) != value.charAt(value.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    static private String reverse(String value){
        String result = "";
        for(int i = value.length() - 1; i >=0; i--){
            result+= value.charAt(i);
        }
        return result;
    }
}
