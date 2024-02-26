import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income: ");
        int income = scanner.nextInt();

        int taxableIncome = income - 250000; // Deducting the non-taxable income

        double tax = 0;

        if (taxableIncome <= 0) {
            // No tax for income less than or equal to 2,50,000
            System.out.println("No tax");
        } else if (taxableIncome <= 250000) {
            // 10% tax for taxable income between 2,50,001 - 5,00,000
            tax = taxableIncome * 0.1;
        } else if (taxableIncome <= 500000) {
            // 20% tax for taxable income between 5,00,001 - 10,00,000
            tax = 250000 * 0.1 + (taxableIncome - 250000) * 0.2;
        } else {
            // 30% tax for taxable income above 10,00,000
            tax = 250000 * 0.1 + 250000 * 0.2 + (taxableIncome - 500000) * 0.3;
        }

        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax = " + tax);

        scanner.close();
    }
}
