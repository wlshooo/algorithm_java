package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;

public class Q모음사전_ {
    public static void main(String[] args) {
        int result = solution("AAAAE");
        System.out.println(result);
    }
    static ArrayList<String> list=new ArrayList<>();
    static char[] ch={'A','E','I','O','U'};

    static public int solution(String word) {

        backtracking(0,"");
        Collections.sort(list);
        int index=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(word)){
                index=i;
                break;
            }
        }
        return index;

    }
    public static void backtracking(int depth,String word){
        list.add(word);
        if(depth==5){
            return;
        }

        for(int i=0;i<ch.length;i++){
            backtracking(depth+1,word+ch[i]);
        }
    }
}
