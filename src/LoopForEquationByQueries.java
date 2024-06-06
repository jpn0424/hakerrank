import java.util.Scanner;

public class LoopForEquationByQueries {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (!(0 <= t && t <= 500)) {
            return;
        }
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // check a, b, n constraints
            if (!(0 <= a && a <= 50) || !(0 <= b && b <= 50) || !(1 <= n && n <= 15)) {
                return;
            }
            for (int j = 0; j < n; j++) {
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
        }
        in.close();
    }
}