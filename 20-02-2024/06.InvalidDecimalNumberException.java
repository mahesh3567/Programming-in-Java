import java.util.Scanner;

class InvalidDecimalNumberException extends Exception {
    public InvalidDecimalNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a decimal number: ");
            String input = scanner.next();
            if (!isValidDecimal(input)) {
                throw new InvalidDecimalNumberException("Invalid decimal number entered");
            }
            double number = Double.parseDouble(input);
            System.out.println("Entered number: " + number);
        } catch (InvalidDecimalNumberException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid format for decimal number");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }

    // Method to validate if the input is a valid decimal number
    public static boolean isValidDecimal(String input) {
        // Regular expression to match a decimal number
        String decimalRegex = "^[-+]?\\d*\\.?\\d+$";
        return input.matches(decimalRegex);
    }
}
