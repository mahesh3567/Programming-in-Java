import java.util.Scanner;

public class primeandcomposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers to check: ");
        int n = scanner.nextInt();

        int countPrime = 0;
        int countComposite = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter an integer: ");
            int num = scanner.nextInt();

            if (num < 2) {
                continue;
            }

            if (isPrime(num)) {
                countPrime++;
            } else {
                countComposite++;
            }
        }

        System.out.println("Total prime numbers: " + countPrime);
        System.out.println("Total composite numbers: " + countComposite);
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}