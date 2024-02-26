import java.util.Scanner;

public class PalindromePartitioning {

    public static int minCuts(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        for (int cl = 1; cl < n; cl++) {
            for (int i = 0; i + cl < n; i++) {
                int j = i + cl;
                if (isPalindrome(s, i, j)) {
                    dp[i][j] = 0;
                } else {
                    int min = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        int temp = dp[i][k] + dp[k + 1][j] + 1;
                        if (temp < min) {
                            min = temp;
                        }
                    }
                    dp[i][j] = min;
                }
            }
        }
        return dp[0][n - 1];
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string S: ");
        String s = scanner.nextLine();
        int minCuts = minCuts(s);
        System.out.println("Example 1:");
        System.out.println("Input: S = " + s);
        System.out.println("Output: minCuts = " + minCuts);
    }
}