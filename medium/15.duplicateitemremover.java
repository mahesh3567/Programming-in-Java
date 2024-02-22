import java.util.HashSet;
import java.util.Scanner;

public class duplicateitemremover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }

        System.out.println("Non-duplicate items: ");
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}