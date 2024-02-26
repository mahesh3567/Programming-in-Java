import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeakestRows {

    public static List<Integer> kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] soldiers = new int[m][2];
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            soldiers[i][0] = count;
            soldiers[i][1] = i;
        }
        sort(soldiers);
        return getIndices(soldiers, k);
    }

    private static void sort(int[][] soldiers) {
        for (int i = 0; i < soldiers.length; i++) {
            for (int j = 0; j < soldiers.length - 1; j++) {
                if (soldiers[j][0] > soldiers[j + 1][0] || soldiers[j][0] == soldiers[j + 1][0] && soldiers[j][1] > soldiers[j + 1][1]) {
                    int[] temp = soldiers[j];
                    soldiers[j] = soldiers[j + 1];
                    soldiers[j + 1] = temp;
                }
            }
        }
    }

    private static List<Integer> getIndices(int[][] soldiers, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(soldiers[i][1]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns (m and n) in the matrix: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        List<Integer> result = kWeakestRows(mat, k);
        System.out.println("Example 1:");
        System.out.println("Input: mat = ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(String.valueOf(mat[i]));
        }
        System.out.println("k = " + k);
        System.out.println("Output: " + result);
    }
}