import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array 1
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input array 2
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        scanner.close();

        // Finding common elements
        int[] commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        List<Integer> commonElementsList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                commonElementsList.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] commonElementsArray = new int[commonElementsList.size()];
        for (int k = 0; k < commonElementsList.size(); k++) {
            commonElementsArray[k] = commonElementsList.get(k);
        }

        return commonElementsArray;
    }
}
