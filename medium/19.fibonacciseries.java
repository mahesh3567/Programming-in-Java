import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the n value: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + ":");

        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
