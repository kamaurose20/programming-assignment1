import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password";
        String[] cars = {"Toyota", "Honda"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username:");
        String user = scanner.nextLine();
        System.out.println("Password:");
        String pass = scanner.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login OK!");
            System.out.println("Cars: " + cars[0] + ", " + cars[1]);
            System.out.println("Rent? (y/n)");
            String rent = scanner.nextLine();
            if (rent.equals("y")) {
                System.out.println("Car rented!");
            } else {
                System.out.println("Bye!");
            }
        } else {
            System.out.println("Login failed!");
        }
    }
}