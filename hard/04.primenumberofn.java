import java.util.Scanner;

public class primenumberofn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N = ");
        int n = scanner.nextInt();
        
        int nthPrime = findNthPrime(n);
        System.out.println(n + "th Prime number is " + nthPrime);
        
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        printNextPrimes(nthPrime, n);
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int findNthPrime(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            num++;
        }
        return num - 1;
    }
    
    public static void printNextPrimes(int startPrime, int n) {
        int count = 0;
        int num = startPrime + 1;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + ", ");
                count++;
            }
            num++;
        }
    }
}
