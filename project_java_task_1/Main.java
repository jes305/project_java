import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginSystem system = new LoginSystem();

        try {
            System.out.print("Register Username: ");
            String username = sc.nextLine();

            System.out.print("Register Password: ");
            String password = sc.nextLine();

            system.validatePassword(password);

            User user = new User(username, password);

            System.out.println("Registration Successful!\n");

            while (true) {
                System.out.print("Enter password to login: ");
                String loginPass = sc.nextLine();
                system.login(user, loginPass);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}