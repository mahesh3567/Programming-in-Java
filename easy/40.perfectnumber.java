import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the given number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Perfect numbers are defined only for positive integers.");
        } else {
            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.println("It's a Perfect Number");
            } else {
                System.out.println("It's not a Perfect Number");
            }
        }
    }
}
