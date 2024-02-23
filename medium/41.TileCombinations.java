import java.util.Arrays;
import java.util.Scanner;

public class TileCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the tiles: ");
        String tiles = scanner.nextLine();
        scanner.close();

        int result = numTileCombinations(tiles);
        System.out.println("Result: " + result);
    }

    public static int numTileCombinations(String tiles) {
        int[] count = new int[26];
        for (char c : tiles.toCharArray()) {
            count[c - 'A']++;
        }

        long total = 1;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                continue;
            }
            total *= (count[i] + 1);
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                continue;
            }
            total -= getCombinations(count[i], count[i] - 1);
        }

        return (int) (total % (1e9 + 7));
    }

    private static long getCombinations(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }

        long num = 1;
        long den = 1;
        for (int i = 1; i <= k; i++) {
            num *= n;
            den *= i;
            n--;
        }

        return num / den;
    }
}