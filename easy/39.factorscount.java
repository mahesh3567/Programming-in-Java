import java.util.Scanner;

public class factorscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the given number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Number of factors is undefined for non-positive numbers.");
        } else {
            int count = 0;

            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                   
                    if (number / i == i) {
                        count++;
                    } else {
                       
                        count += 2;
                    }
                }
            }

            System.out.println("Number of factors = " + count);
        }
    }
}
