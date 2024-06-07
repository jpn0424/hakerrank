import java.util.Scanner;

public class StaticInitBlock {

    static int area;

    static {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        if (!(B > 0) || !(H > 0)) {
            throw new RuntimeException("Breadth and height must be positive");
        } else {
            area = B * H;
        }
    }

    public static void main(String[] argh) {
        if (area > 0) {
            System.out.println(area);
        }
    }
}