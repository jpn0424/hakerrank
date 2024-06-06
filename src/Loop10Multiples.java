import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop10Multiples {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("N: " + N);
//        if (N >= 2 && N <= 20) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(N + " x " + i + " = " + N * i);
//            }
//        }

        // 遞迴寫法
        printMultiples(N, 1);

        bufferedReader.close();
    }

    public static void printMultiples(int N, int i) {
        // 先寫上限制
        if (i > 10) {
            return;
        }
        System.out.println(N + " x " + i + " = " + N * i);

        // 開始遞迴, 達到限制就會跳脫
        printMultiples(N, i + 1);
    }
}
