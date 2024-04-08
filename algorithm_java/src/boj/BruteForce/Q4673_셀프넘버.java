package boj.BruteForce;
//s5
public class Q4673_셀프넘버 {
    public static void main(String[] args) {

        int[] answer = new int[10001];

        for (int i = 1; i < 10000; i++) {
            int cal = cal(i);
            if (cal <= 10000) {
                answer[cal] = 1;
            }

        }
        for (int i = 1; i < 10000; i++) {
            if (answer[i] == 0) {
                System.out.println(i);
            }
        }
    }
    static int cal(int num) {
        int originNum = num;
        int result = 0;
        while (true) {
            if (num / 10 == 0) {
                result += num%10;
                return result + originNum;
            }
            result+=num%10;
            num= num/10;
        }
    }
}
