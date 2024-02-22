import java.util.Hashtable;
import java.util.Scanner;

public class hashtable {

    public static void main(String[] args) {
        Hashtable<Integer, String> bankDetails = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        // Add 3 records
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            bankDetails.put(accountNumber, customerName);
        }

        // Display the size of HashTable
        System.out.println("Size of HashTable: " + bankDetails.size());

        // Clear the HashTable
        bankDetails.clear();
        System.out.println("HashTable cleared.");

        scanner.close();
    }
}