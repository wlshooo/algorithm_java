package ready.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q6_암호생성기 {
    static Queue<Integer> queue;
    static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            num = Integer.parseInt(br.readLine());
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            queue = new LinkedList<>();
            for (int i : array) {
                queue.add(i);
            }

            while (true) {
                if (cycle()) break;
            }
        }
    }

    private static boolean cycle() {
        for (int i = 1; i <= 5; i++) {
            Integer remove = queue.remove() - i;
            if (remove <= 0) {
                remove = 0;
                queue.add(remove);
                System.out.print("#" + num +" ");
                for (Integer integer : queue) {
                    System.out.print(integer + " ");
                }
                System.out.println();
                return true;
            }
            queue.add(remove);
        }
        return false;
    }

}
