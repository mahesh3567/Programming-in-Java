import java.util.Scanner;

public class validusername{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a username: ");
        String username = scanner.nextLine();

        scanner.close();

        if (isValidUsername(username)) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid");
        }
    }
    private static boolean isValidUsername(String username) {
        if (username.length() >= 4 && username.length() <= 20) {
            if (username.matches("[a-zA-Z0-9]+")) {
                return true;
            }
        }

        return false;
    }
}
