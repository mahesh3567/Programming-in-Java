import java.util.Scanner;

public class charactercounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;

        System.out.println("Enter * to exit...");
        System.out.println("Enter any character:");
        char c = scanner.next().charAt(0);
        while (c != '*') {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            }
            System.out.println("Enter any character:");
            c = scanner.next().charAt(0);
        }

        System.out.println("Total count of lower case: " + lowerCaseCount);
        System.out.println("Total count of upper case: " + upperCaseCount);
        System.out.println("Total count of numbers = " + numberCount);

        scanner.close();
    }
}