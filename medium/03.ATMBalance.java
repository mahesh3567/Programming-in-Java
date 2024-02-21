import java.util.Scanner;

public class ATMBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of denominations: ");
        int numDenominations = scanner.nextInt();

        int[] denominations = new int[numDenominations];
        int[] notes = new int[numDenominations];

        System.out.println("Enter the denominations(2000,500,200,100) and their number of notes:");
        for (int i = 0; i < numDenominations; i++) {
            denominations[i] = scanner.nextInt();
            notes[i] = scanner.nextInt();
        }

        int totalBalance = 0;
        for (int i = 0; i < numDenominations; i++) {
            totalBalance += denominations[i] * notes[i];
        }

        System.out.println("Total Available Balance in ATM: " + totalBalance);

        scanner.close();
    }
}