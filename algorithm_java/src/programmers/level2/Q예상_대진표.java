package programmers.level2;

public class Q예상_대진표 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(4, 3, 4);
        System.out.println(solution1);
    }
    static class Solution
    {
        public int solution(int n, int a, int b)
        {

            if (a > b) {
                int temp = a;
                a= b;
                b=temp;
            }
            int count =1;

            while (true) {

                if (b - a == 1 && a % 2 == 1) {
                    break;
                } else {
                    if (a % 2 == 1) {
                        a = a / 2 + 1;
                    } else {
                        a = a/2;
                    }
                    if (b % 2 == 1) {
                        b = b / 2 + 1;
                    } else {
                        b = b/2;
                    }
                }
                count++;
            }

            return count;
        }
    }
}