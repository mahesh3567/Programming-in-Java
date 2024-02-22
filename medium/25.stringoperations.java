import java.util.Scanner;

public class stringoperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Replace any word in the given String
        String replacedString = inputString.replace("Saveetha", "XYZ");
        System.out.println("Replaced String: " + replacedString);

        // Find the length
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Uppercase Conversion
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase Conversion: " + upperCaseString);

        scanner.close();
    }
}