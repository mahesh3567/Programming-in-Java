import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class squarerootofanumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter the upper range: ");
        int upperRange = scanner.nextInt();

        List<int[]> result = createArray(lowerRange, upperRange);
        
        // Printing the result in a readable format
        System.out.print("[");
        for (int[] pair : result) {
            System.out.print("(" + pair[0] + ", " + pair[1] + "), ");
        }
        System.out.println("]");
    }

    public static List<int[]> createArray(int lower, int upper) {
        List<int[]> result = new ArrayList<>();
        for (int num = lower; num <= upper; num++) {
            int square = num * num;
            result.add(new int[]{num, square});
        }
        return result;
    }
}
