import java.util.Scanner;

public class ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int reverseNumber = reverse(number);

        while (originalNumber != reverseNumber) {
            int sum = originalNumber + reverseNumber;
            System.out.println(originalNumber + " + " + reverseNumber + " = " + sum);
            originalNumber = sum;
            reverseNumber = reverse(sum);
        }

        System.out.println("Palindrome reached: " + originalNumber);
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
