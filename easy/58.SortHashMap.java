import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = new HashMap<>();

        System.out.print("Enter the number of entries: ");
        int numEntries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEntries; i++) {
            System.out.print("Enter key for entry " + (i + 1) + ": ");
            String key = scanner.nextLine();

            System.out.print("Enter value for entry " + (i + 1) + ": ");
            int value = scanner.nextInt();
            scanner.nextLine();

            hashMap.put(key, value);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(hashMap);

        System.out.println("Sorted HashMap by Keys:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
