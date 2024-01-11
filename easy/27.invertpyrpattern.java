import java.util.Scanner;

public class invertpyrpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the stars
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * (numRows - i)) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();  // Move to the next line
        }
    }
}
