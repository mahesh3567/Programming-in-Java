import java.util.Scanner;

public class factorcounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        
        System.out.print("N = ");
        int n = scanner.nextInt();
        
        int factorsCount = countFactors(number);
        System.out.println("Number of factors = " + factorsCount);
        
        int nthFactor = findNthFactor(number, n);
        System.out.println(n + "th factor of " + number + " = " + nthFactor);
    }
    
    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static int findNthFactor(int number, int n) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1;
    }
}
