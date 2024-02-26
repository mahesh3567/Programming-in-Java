import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public void update(int index, int val) {
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of queries: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            queries.add(scanner.nextLine());
        }
        int[] nums = new int[]{1, 3, 5};
        NumArray numArray = new NumArray(nums);
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < queries.size(); i += 2) {
            if (queries.get(i).equals("sumRange")) {
                String[] parts = queries.get(i + 1).split(" ");
                int left = Integer.parseInt(parts[0]);
                int right = Integer.parseInt(parts[1]);
                results.add(numArray.sumRange(left, right));
            } else if (queries.get(i).equals("update")) {
                String[] parts = queries.get(i + 1).split(" ");
                int index = Integer.parseInt(parts[0]);
                int val = Integer.parseInt(parts[1]);
                numArray.update(index, val);
            }
        }
        StringBuilder numsStringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            numsStringBuilder.append(nums[i]);
            if (i < nums.length - 1) {
                numsStringBuilder.append(", ");
            }
        }
        System.out.println("Input: queries = [" + String.join(", ", queries) + "]");
        System.out.println("Nums: " + numsStringBuilder.toString());
        System.out.println("Results: " + results);
    }
}