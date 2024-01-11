import java.util.Scanner;

public class reversenumloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        long number = extractNumber(userInput);
        
        if (number != Long.MIN_VALUE) {
            long reversedNumber = reverseNumber(number);
            System.out.println("Reversed Number: " + reversedNumber);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    static long extractNumber(String input) {
        long number = 0;
        boolean isNegative = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                number = number * 10 + Character.getNumericValue(currentChar);
            } else if (i == 0 && currentChar == '-') {
                isNegative = true;
            } else {
                return Long.MIN_VALUE;
            }
        }

        return isNegative ? -number : number;
    }

    static long reverseNumber(long num) {
        long reversed = 0;

        while (num != 0) {
            long digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
