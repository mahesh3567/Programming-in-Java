import java.util.Arrays;

class GenericSort<T extends Comparable<T>> {
    private T[] array;

    public GenericSort(T[] array) {
        this.array = array;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void display() {
        System.out.println(Arrays.toString(array));
    }
}

public class GenericsSortExample {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 7};
        GenericSort<Integer> intSort = new GenericSort<>(intArray);
        intSort.sort();
        System.out.print("Sorted Integer Array: ");
        intSort.display();

        String[] stringArray = {"apple", "orange", "banana", "grape"};
        GenericSort<String> stringSort = new GenericSort<>(stringArray);
        stringSort.sort();
        System.out.print("Sorted String Array: ");
        stringSort.display();
    }
}
