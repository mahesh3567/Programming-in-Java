import java.util.Scanner;

public class NthOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();

        int count = 0;
        int i = 1;

        while (count < N) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

        System.out.printf("%nHence the value printed for i is %d.%n", i - 1);

        scanner.close();
    }
}
