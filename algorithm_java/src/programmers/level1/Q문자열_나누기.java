package programmers.level1;



public class Q문자열_나누기 {
    public static void main(String[] args) {
        String s = "aaabbaccccabba";
        char first = s.charAt(0);
        int firstNum = 0;
        int diff = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {
                result++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstNum++;
            else diff++;
        }
        System.out.println(result);
    }
}