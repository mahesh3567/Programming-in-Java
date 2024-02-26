import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ransom note: ");
        String ransomNote = scanner.nextLine();
        System.out.print("Enter the magazine: ");
        String magazine = scanner.nextLine();
        scanner.close();

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println("Can construct: " + result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        // Count characters in magazine
        for (char ch : magazine.toCharArray()) {
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }
        // Check if ransomNote can be constructed
        for (char ch : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(ch) || magazineMap.get(ch) == 0) {
                return false; // Character not found or exhausted
            }
            magazineMap.put(ch, magazineMap.get(ch) - 1); // Reduce count of available characters
        }
        return true;
    }
}
