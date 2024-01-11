import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        String userInput = scanner.nextLine();

        try {
            int decimal = Integer.parseInt(userInput);

            if (decimal < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            } else {
                String binary = decimalToBinary(decimal);
                String reversedBinary = reverseBinary(binary);

                System.out.println("Original Binary: " + binary);
                System.out.println("Reversed Binary: " + reversedBinary);
                System.out.println("Decimal Equivalent: " + Integer.parseInt(reversedBinary, 2));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    static String reverseBinary(String binary) {
        StringBuilder reversedBinary = new StringBuilder(binary).reverse();
        return reversedBinary.toString();
    }
}
