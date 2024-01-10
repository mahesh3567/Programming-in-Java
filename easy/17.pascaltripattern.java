import java.util.Scanner;

public class pascaltripattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + "   ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
