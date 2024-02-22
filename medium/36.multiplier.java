import java.util.Scanner;

public class multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        String num1 = scanner.nextLine();

        System.out.print("Enter the second non-negative integer: ");
        String num2 = scanner.nextLine();

        try {
            String product = multiply(num1, num2);
            System.out.println("Product: " + product);
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    private static String multiply(String num1, String num2) {
        if (!isValid(num1) || !isValid(num2)) {
            throw new NumberFormatException("Invalid input");
        }

        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                int sum = result[i + j + 1] + product;
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder product = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) {
                continue;
            }
            product.append(result[i]);
        }

        return product.toString();
    }

    private static boolean isValid(String num) {
        return num.matches("\\d*");
    }
}
}