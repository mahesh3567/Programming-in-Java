import java.util.Scanner;

public class matrixinputanddisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (NxN): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Input the matrix
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix row-wise
        System.out.println("\nMatrix displayed row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the matrix column-wise
        System.out.println("\nMatrix displayed column-wise:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}