import java.util.Scanner;

public class FormattingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // 先將 s1 固定長度, 之後將數字 x 補 0 至 3 位數
            // 這樣就可以把字串長度固定.
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}