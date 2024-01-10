import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mergesortarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        ArrayList<Integer> arr3 = new ArrayList<>();

        int i = 0, j = 0;

        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                arr3.add(arr1[i]);
                i++;
            } else {
                arr3.add(arr2[j]);
                j++;
            }
        }

        while (i < size1) {
            arr3.add(arr1[i]);
            i++;
        }

        while (j < size2) {
            arr3.add(arr2[j]);
            j++;
        }

        Collections.sort(arr3);

        System.out.println("Merged Sorted Array: " + arr3);
    }
}
