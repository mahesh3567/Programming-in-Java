import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        boolean isPowerOfThree = false;

        if (n > 0) {
            while (n % 3 == 0) {
                n /= 3;
            }
            isPowerOfThree = n == 1;
        }

        System.out.println(isPowerOfThree);

        scanner.close();
    }
}
