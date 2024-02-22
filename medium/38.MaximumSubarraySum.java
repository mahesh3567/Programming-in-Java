import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Output: " + maxSum);

        scanner.close();
    }
}
