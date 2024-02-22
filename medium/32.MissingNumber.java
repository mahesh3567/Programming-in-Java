import java.util.Scanner;

public class missingnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] a = new int[n - 1];
        System.out.print("Enter the elements of the array separated by space: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }

}