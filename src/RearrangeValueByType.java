import java.util.Scanner;

public class RearrangeValueByType {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = "";
        while(sc.hasNext()) {
            s = sc.nextLine();
        }
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}