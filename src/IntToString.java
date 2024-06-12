import java.security.Permission;
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            // get int and check -100 < n < 100
            if (n < -100 || n > 100) {
                System.out.println("Wrong answer");
            }

            String s = String.valueOf(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }

        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

    //The following class will prevent you from terminating the code using exit(0)!
    public static class DoNotTerminate {
        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }

    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1;
    }
}