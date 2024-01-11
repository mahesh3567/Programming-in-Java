import java.util.Scanner;

public class hollowsquaredollarpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int sideLength = scanner.nextInt();

        for (int i = 1; i <= sideLength; i++) {
            System.out.print("$ ");
        }
        System.out.println();

        for (int i = 2; i <= sideLength - 1; i++) {
            System.out.print("$ ");
            for (int j = 2; j <= sideLength - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("$ ");
        }

        for (int i = 1; i <= sideLength; i++) {
            System.out.print("$ ");
        }
    }
}
