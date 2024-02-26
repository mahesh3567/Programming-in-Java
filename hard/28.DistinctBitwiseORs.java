import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctBitwiseORs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Calculate and print the number of distinct bitwise ORs
        System.out.println("Number of distinct bitwise ORs: " + countDistinctBitwiseORs(arr));
        
        scanner.close();
    }

    public static int countDistinctBitwiseORs(int[] arr) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> current = new HashSet<>();
        Set<Integer> next;

        for (int num : arr) {
            next = new HashSet<>();
            next.add(num);
            for (int val : current) {
                next.add(val | num);
            }
            result.addAll(next);
            current = next;
        }

        return result.size();
    }
}
