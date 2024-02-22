import java.util.Scanner;

public class multicatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.print("Enter the index of the array element you want to access: ");
            int index = scanner.nextInt();

            int[] array = new int[5];
            array[index] = 42;

            System.out.print("Enter a number to divide: ");
            int numberToDivide = scanner.nextInt();

            int result = number / numberToDivide;

            System.out.println("Result: " + result);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Program continues execution...");
        scanner.close();
    }
}