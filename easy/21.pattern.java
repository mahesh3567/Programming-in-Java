import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Character to be printed: ");
        char charToPrint = scanner.next().charAt(0);

        System.out.print("Max Number of times printed: ");
        int maxPrintTimes = scanner.nextInt();

        for (int i = 1; i <= maxPrintTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(charToPrint + " ");
            }
            System.out.println();
        }
    }
}
