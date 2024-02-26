public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        // Accessing an array element outside its bound
        try {
            int element = array[3];
            System.out.println("Accessed element: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound Exception: " + e);
        }

        // Iterating beyond the array length
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Accessed element: " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound Exception: " + e);
        }

        // Nested array and incorrect index
        int[][] nestedArray = {{1, 2}, {3, 4}, {5, 6}};
        try {
            int element = nestedArray[3][1];
            System.out.println("Accessed element: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound Exception: " + e);
        }

        // Passing incorrect array to the method
        int[] incorrectArray = {1, 2, 3};
        printArray(incorrectArray);
    }

    public static void printArray(int[] array) {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Accessed element: " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound Exception: " + e);
        }
    }
}