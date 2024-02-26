import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciLikeSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a string of digits: ");
        String num = scanner.nextLine();
        
        // Calculate and print the Fibonacci-like sequence
        List<Integer> result = splitIntoFibonacci(num);
        if (result.isEmpty()) {
            System.out.println("No Fibonacci-like sequence can be formed.");
        } else {
            System.out.println("Fibonacci-like sequence: " + result);
        }
        
        scanner.close();
    }

    public static List<Integer> splitIntoFibonacci(String num) {
        List<Integer> res = new ArrayList<>();
        backtrack(res, num, 0);
        return res;
    }

    private static boolean backtrack(List<Integer> res, String num, int index) {
        if (index == num.length() && res.size() >= 3) {
            return true;
        }
        for (int i = index; i < num.length(); i++) {
            if (num.charAt(index) == '0' && i > index) {
                break; // leading zero is not allowed
            }
            long current = Long.parseLong(num.substring(index, i + 1));
            if (current > Integer.MAX_VALUE) {
                break;
            }
            int size = res.size();
            if (size >= 2 && current > res.get(size - 1) + res.get(size - 2)) {
                break;
            }
            if (size <= 1 || current == res.get(size - 1) + res.get(size - 2)) {
                res.add((int) current);
                if (backtrack(res, num, i + 1)) {
                    return true;
                }
                res.remove(res.size() - 1);
            }
        }
        return false;
    }
}
