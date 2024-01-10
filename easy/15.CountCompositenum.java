import java.util.ArrayList;
import java.util.Scanner;

public class CountCompositenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of values:");
        int noOfValues = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < noOfValues; i++) {
            System.out.println("Enter value #" + (i + 1) + ": ");
            values.add(scanner.nextInt());
        }
        int compositeCount = 0;
        for (int num : values) {
            if (num < 2) {
                continue;
            }
            boolean isComposite = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) {
                compositeCount++;
            }
        }

        System.out.println("No.of composite num: " + compositeCount);
        scanner.close();
    }
}
