import java.util.Scanner;

public class skipnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        if (m > n) {
            System.out.println("Invalid input. M should be less than or equal to N.");
        } else {
            System.out.print("Numbers from " + m + " to " + n + " by skipping " + k + " numbers: ");

            for (int i = m; i <= n; i += k) {
                System.out.print(i + " ");
            }
        }
    }
}
