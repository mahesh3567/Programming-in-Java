import java.util.Scanner;

public class stringtoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isValidInteger(inputString)) {
            int convertedInteger = Integer.parseInt(inputString);
            System.out.println("Converted Integer: " + convertedInteger);
        } else {
            System.out.println("Error: Input is not a valid integer.");
        }
    }

    private static boolean isValidInteger(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        int startIndex = 0;
        if (input.charAt(0) == '-' || input.charAt(0) == '+') {
            if (input.length() == 1) {
                return false;
            }
            startIndex = 1;
        }

        for (int i = startIndex; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
