import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sorting<T> {

    public void sort(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }

    public static void main(String[] args) {
        Sorting<Integer> intSorter = new Sorting<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers to sort: ");
        int numIntegers = scanner.nextInt();
        List<Integer> intList = new ArrayList<>();
        System.out.println("Enter the integers:");
        for (int i = 0; i < numIntegers; i++) {
            intList.add(scanner.nextInt());
        }
        intSorter.sort(intList, Integer::compare);
        System.out.println("Sorted integers:");
        for (Integer num : intList) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}