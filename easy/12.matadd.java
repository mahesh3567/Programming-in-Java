import java.util.Scanner;

public class matadd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, c;

        System.out.println("Enter the number of rows: ");
        r = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        c = scanner.nextInt();

        int[][] mat1 = new int[r][c];
        int[][] mat2 = new int[r][c];
        int[][] mat3 = new int[r][c];

        System.out.println("Enter values for matrix 1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter values for matrix 2:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.println(mat3[i][j] + " ");
            }
           System.out.println();
        }

    }
}
