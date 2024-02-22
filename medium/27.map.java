import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {

    public static void main(String[] args) {
        Map<Integer, String> employeeRecords = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Add object
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        employeeRecords.put(employeeId, employeeName);

        // Display the size of Map
        System.out.println("Size of Map: " + employeeRecords.size());

        // Check if Map is empty or not
        System.out.println("Is Map empty? " + employeeRecords.isEmpty());

        // Remove specified object
        System.out.print("Enter employee ID to remove: ");
        int removeId = scanner.nextInt();
        employeeRecords.remove(removeId);

        // Clear the Map
        employeeRecords.clear();
        System.out.println("Map cleared.");

        scanner.close();
    }
}