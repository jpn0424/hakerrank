import java.util.Scanner;

public class StopReadFile {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(i++ + " " + s);
            // 注意不能用 ' ', 因為 ' ' 代表一個字元, 所以當他與數字相加時, 會被轉成數字
            // System.out.println(i++ + ' ' + s); 這樣代表 i++ + 32 + s
        }
    }
}