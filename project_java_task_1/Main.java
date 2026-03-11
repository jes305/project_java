import java.util.Scanner;

class PasswordChecker extends Password {

    public PasswordChecker(String password) {
        super(password);
    }
    @Override
    public void checkStrength() throws Exception {

        String p = getPassword();

        if (p.length() < 8)
            throw new Exception("Password must be at least 8 characters");

        if (!p.matches(".*[A-Z].*"))
            throw new Exception("Add an uppercase letter");

        if (!p.matches(".*[0-9].*"))
            throw new Exception("Add a number");

        System.out.println("Strong Password ");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        Password p = new PasswordChecker(pass);

        try {
            p.checkStrength();
        } 
        catch (Exception e) {
            System.out.println("Weak Password: " + e.getMessage());
        }

        sc.close();
    }
}
