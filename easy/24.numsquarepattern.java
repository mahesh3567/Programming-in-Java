import java.util.Scanner;

public class numsquarepattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        int count = 1;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count * count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
