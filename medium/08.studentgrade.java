import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks in Python: ");
        double python = scanner.nextDouble();

        System.out.print("Enter the marks in C programming: ");
        double cProgramming = scanner.nextDouble();

        System.out.print("Enter the marks in Mathematics: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter the marks in Physics: ");
        double physics = scanner.nextDouble();

        double total = python + cProgramming + mathematics + physics;
        double aggregate = total / 400;

        System.out.println("Total=" + total);
        System.out.printf("Aggregate = %.2f%%%n", aggregate );

        if (aggregate >= 0.75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 0.6) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 0.5) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 0.4) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }

        scanner.close();
    }
}