import java.util.Scanner;

public class compositenumbwrange{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of B: ");
        int b = scanner.nextInt();

        System.out.println("Composite numbers between " + a + " and " + b + ":");

        for (int i = a; i <= b; i++) {
            if (i > 1 && isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isComposite(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }

        return false;
    }
}
