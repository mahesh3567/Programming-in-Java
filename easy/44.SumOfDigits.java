import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int N = scanner.nextInt();

        int sum = 0;

        System.out.printf("Enter %d digit number: ", N);
        int number = scanner.nextInt();

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        while (sum > 9) {
            int tempSum = 0;
            while (sum != 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
