import java.util.Scanner;

public class SquareAndCubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        double givenNumber = scanner.nextDouble();

        double squareResult = Math.pow(givenNumber, 2);
        double cubeResult = Math.pow(givenNumber, 3);

        System.out.printf("Square Number: %.3f%n", squareResult);
        System.out.printf("Cube Number: %.3f%n", cubeResult);

        scanner.close();
    }
}
