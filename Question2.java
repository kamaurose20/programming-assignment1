import java.io.Console;

public class Login {
    public static void main(String[] args) {
        String user = "admin";
        String pass = "password";
        int maxTries = 3;
        Console c = System.console();

        if (c == null) {
            System.out.println("No console. Can't mask password.");
            return;
        }

        for (int tries = 0; tries < maxTries; tries++) {
            System.out.println("Username:");
            String u = c.readLine();
            System.out.println("Password:");
            char[] p = c.readPassword();

            if (u.equals(user) && new String(p).equals(pass)) {
                System.out.println("Login OK!");
                return;
            } else {
                System.out.println("Wrong! Try again.");
            }
        }
        System.out.println("Max attempts reached.");
    }
}