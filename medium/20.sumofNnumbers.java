import java.util.Scanner;

public class sumofNnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter " + N + " numbers: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the " + N + " numbers is: " + sum);
    }
}