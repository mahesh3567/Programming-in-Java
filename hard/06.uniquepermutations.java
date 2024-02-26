import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniquepermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        System.out.println("Permutations are:");
        printUniquePermutations(number);
    }

    public static void printUniquePermutations(int number) {
        Set<String> permutations = new HashSet<>();
        permute("", String.valueOf(number), permutations);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static void permute(String prefix, String remaining, Set<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n), permutations);
            }
        }
    }
}
