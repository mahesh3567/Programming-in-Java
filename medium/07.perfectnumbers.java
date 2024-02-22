import java.util.Scanner;

public class perfectnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int count = 0;
        int i = 1;
        System.out.print("First " + n + " perfect numbers are: ");
        while (count < n) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

        scanner.close();
    }
}