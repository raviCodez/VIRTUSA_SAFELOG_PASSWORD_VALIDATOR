import java.util.Scanner;

public class PasswordValidator {

    // Method to validate password based on given policy
    public static boolean validatePassword(String password) {

        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Check length
        if (password.length() < 8) {
            System.out.println("Too short");
            return false;
        }

        // Loop through each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Feedback messages
        if (!hasUppercase) {
            System.out.println("Missing an uppercase letter");
        }

        if (!hasDigit) {
            System.out.println("Missing a digit");
        }

        // Final validation
        return hasUppercase && hasDigit;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password;

        // Retry mechanism using while loop
        while (true) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (validatePassword(password)) {
                System.out.println("Password is valid");
                break;
            } else {
                System.out.println("Try again");
            }
        }

        scanner.close();
    }
}