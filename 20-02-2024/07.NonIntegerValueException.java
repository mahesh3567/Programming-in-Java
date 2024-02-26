import java.util.Scanner;

class NonIntegerValueException extends Exception {
    public NonIntegerValueException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer value: ");
            String input = scanner.next();
            if (!isValidInteger(input)) {
                throw new NonIntegerValueException("Non-integer value entered");
            }
            int number = Integer.parseInt(input);
            System.out.println("Entered number: " + number);
        } catch (NonIntegerValueException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid format for integer number");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }

    // Method to validate if the input is a valid integer
    public static boolean isValidInteger(String input) {
        // Regular expression to match an integer
        String integerRegex = "^[-+]?\\d+$";
        return input.matches(integerRegex);
    }
}
