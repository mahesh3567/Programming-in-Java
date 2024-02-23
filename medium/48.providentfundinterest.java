import java.util.Scanner;

public class providentfundinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double interest = 0;
        try {
            interest = (principal * rate * years) / 100;
            System.out.println("Interest: " + interest);
        } catch (Exception e) {
            System.out.println("Error calculating interest: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the Provident Fund Interest Calculator.");
        }
    }
}