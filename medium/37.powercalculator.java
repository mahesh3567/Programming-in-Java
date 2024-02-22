import java.util.Scanner;

public class powercalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        int num1 = scanner.nextInt();

        

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        scanner.close();

        double result = pow(num1, n);
        System.out.println("Result: " + result);
    }

    public static double pow(double x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n == 0) {
            return 1.0;
        }

        if (n == 1) {
            return x;
        }

        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}