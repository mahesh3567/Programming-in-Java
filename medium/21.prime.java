import java.util.Scanner;


public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        Thread thread = new Thread(new PrimeChecker(number));
        thread.start();
    }
}
class PrimeChecker implements Runnable {
    private int number;

    PrimeChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

