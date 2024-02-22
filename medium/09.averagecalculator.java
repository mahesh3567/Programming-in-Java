import java.util.Scanner;

public class averagecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double positiveSum = 0;
        double negativeSum = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        System.out.println("Enter -1 to exit...");
        System.out.println("Enter the number:");
        double number = scanner.nextDouble();
        while (number != -1) {
            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            }
            System.out.println("Enter the number:");
            number = scanner.nextDouble();
        }

        if (positiveCount > 0) {
            double positiveAverage = positiveSum / positiveCount;
            System.out.println("The average of positive numbers is: " + positiveAverage);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        if (negativeCount > 0) {
            double negativeAverage = negativeSum / negativeCount;
            System.out.println("The average of negative numbers is: " + negativeAverage);
        } else {
            System.out.println("No negative numbers were entered.");
        }

        scanner.close();
    }
}