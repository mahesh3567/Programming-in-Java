import java.util.Scanner;

public class BinaryValuePartitioning {

    public static int[] partition(int[] arr) {
        int n = arr.length;
        if ( 3 != 0) {
            return new int[]{-1, -1};
        }
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = (prefix[i - 1] << 1) + arr[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int left = prefix[i];
            int right = prefix[n] - prefix[i + 1];
            if (left == right) {
                return new int[]{i, i + n / 3};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array arr: ");
        String[] arrStr = scanner.nextLine().split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        int[] result = partition(arr);
        System.out.println("Example 1:");
        System.out.println("Input: arr = " + String.join(", ", arrStr));
        if (result[0] == -1) {
            System.out.println("Output: [-1, -1]");
        } else {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        }
    }
}