import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int inputNumber = scanner.nextInt();

        int squareRoot = (int) Math.sqrt(inputNumber);

        if (squareRoot * squareRoot == inputNumber) {
            System.out.println("Square Root: " + squareRoot + ", " + (-squareRoot));
        } else {
            System.out.println("The entered number is not a perfect square.");
        }

        scanner.close();
    }
}
