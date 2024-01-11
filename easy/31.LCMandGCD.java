import java.util.Scanner;

public class LCMandGCD{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Please enter at least 2 numbers.");
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int lcm = numbers[0];
        int gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            lcm = (lcm * numbers[i]) / findGCD(lcm, numbers[i]);
            gcd = findGCD(gcd, numbers[i]);
        }

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
