import java.util.Scanner;

public class simpleinterestcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Is the customer a senior citizen (y/n): ");
        char seniorCitizenInput = scanner.next().charAt(0);
        
        boolean isSeniorCitizen = (seniorCitizenInput == 'y' || seniorCitizenInput == 'Y');

        double rateOfInterest = isSeniorCitizen ? 0.12 : 0.10;

        double interest = calculateSimpleInterest(principal, rateOfInterest, years);

        System.out.println("Interest: " + interest);
    }

    static double calculateSimpleInterest(double principal, double rate, int years) {
        return principal * rate * years;
    }
}
