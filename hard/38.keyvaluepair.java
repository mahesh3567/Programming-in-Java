import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class keyvaluepair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Input key-value pairs into the Hashtable
        System.out.println("Enter key-value pairs (enter 'done' to finish):");
        while (true) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            if (key.equals("done")) {
                break;
            }
            System.out.print("Enter value: ");
            String value = scanner.nextLine();
            hashtable.put(key, value);
        }

        // Displaying all keys in the Hashtable
        System.out.println("\nAll keys in the Hashtable:");
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // Searching for a key
        System.out.print("\nEnter the key to search: ");
        String searchKey = scanner.nextLine();
        if (hashtable.containsKey(searchKey)) {
            System.out.println("Value for key '" + searchKey + "': " + hashtable.get(searchKey));
        } else {
            System.out.println("Key '" + searchKey + "' not found in the Hashtable.");
        }

        scanner.close();
    }
}
