import java.util.Arrays;
import java.util.Scanner;

public class mthmaxnmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        Arrays.sort(arr);

        int mthMax = arr[n - M];
        int nthMin = arr[N - 1];

        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;

        System.out.println("Mth Maximum Number: " + mthMax);
        System.out.println("Nth Minimum Number: " + nthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        scanner.close();
    }
}