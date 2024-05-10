package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_회문1 {
    static int N;
    static String[][] map;
    static BufferedReader br;

    static int result;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            init();
            if (N == 1) {
                System.out.println("#" + tc + " " + 64);
                continue;
            }
            palindrome();

            System.out.println("#" + tc + " " + result);
        }
    }

    private static void palindrome() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - N + 1; j++) {
                String rowString = "";
                String columnString = "";
                for (int k = j; k < j + N; k++) {
                    rowString += map[i][k];
                    columnString += map[k][i];
                }
                result += palindromeCheck(rowString);
                result += palindromeCheck(columnString);
            }
        }
    }

    private static int palindromeCheck(String string) {
        if (string.length() % 2 == 1) {
            return odd(string) ? 1 : 0;

        } else {
            return even(string) ? 1 : 0;
        }
    }

    private static boolean odd(String string) {
        int mid = string.length() / 2;
        String left = "";
        String right = "";

        for (int i = 0; i < mid; i++) {
            left += string.charAt(i);
        }
        for (int j = string.length() - 1; j > mid; j--) {
            right += string.charAt(j);
        }

        return left.equals(right);
    }

    private static boolean even(String string) {
        int mid = string.length() / 2;
        String left = "";
        String right = "";

        for (int i = 0; i < mid; i++) {
            left += string.charAt(i);
        }
        for (int j = string.length() - 1; j >= mid; j--) {
            right += string.charAt(j);
        }
        return left.equals(right);
    }

    private static void init() throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new String[8][8];
        result = 0;
        for (int i = 0; i < 8; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < 8; j++) {
                map[i][j] = split[j];
            }
        }
    }
}

/*import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            String[][] map = new String[8][8];

            for (int i = 0; i < 8; i++) {
                map[i] = br.readLine().split("");
            }

            result += countPalindromes(map, N);
            result += countVerticalPalindromes(map, N);

            System.out.println("#" + tc + " " + result);
        }
    }

    private static int countPalindromes(String[][] map, int N) {
        int count = 0;

        // 가로 방향 회문 검사
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= 8 - N; j++) {
                if (isPalindrome(map[i], j, j + N - 1)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static int countVerticalPalindromes(String[][] map, int N) {
        int count = 0;

        // 세로 방향 회문 검사
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i <= 8 - N; i++) {
                String[] column = new String[N];
                for (int k = 0; k < N; k++) {
                    column[k] = map[i + k][j];
                }
                if (isVerticalPalindrome(column)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isPalindrome(String[] array, int start, int end) {
        while (start < end) {
            if (!array[start].equals(array[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isVerticalPalindrome(String[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if (!array[start].equals(array[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}*/

