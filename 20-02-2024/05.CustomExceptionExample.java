import java.util.Scanner;

public class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative value: ");
        int value = scanner.nextInt();
        try {
            nonNegativeValue(value);
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void nonNegativeValue(int value) throws NegativeValueException {
        if (value < 0) {
            throw new NegativeValueException("Value cannot be negative");
        }
    }
}