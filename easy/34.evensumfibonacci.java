import java.util.Scanner;

public class evensumfibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the n value: ");
        int n = scanner.nextInt();

        int evenSum = calculateEvenSumFibonacci(n);

        System.out.println("Sum of Fibonacci series at even indexes: " + evenSum);
    }

    static int calculateEvenSumFibonacci(int n) {
        int first = 0, second = 1, evenSum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += first;
            }

            int next = first + second;
            first = second;
            second = next;
        }

        return evenSum;
    }
}
