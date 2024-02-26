import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perfectsquareswithdigitsumlessthanten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();
        
        List<Integer> perfectSquares = findPerfectSquaresWithDigitSumLessThanTen(lowerRange, upperRange);
        System.out.println(perfectSquares);
    }
    
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    public static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    public static List<Integer> findPerfectSquaresWithDigitSumLessThanTen(int lowerRange, int upperRange) {
        List<Integer> result = new ArrayList<>();
        for (int i = lowerRange; i <= upperRange; i++) {
            if (isPerfectSquare(i) && digitSum(i) < 10) {
                result.add(i);
            }
        }
        return result;
    }
}
