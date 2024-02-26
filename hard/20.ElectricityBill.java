import java.util.Scanner;

public class ElectricityBill {

    private int consumerNo;
    private String consumerName;
    private int previousMonthReading;
    private int currentMonthReading;

    public ElectricityBill(int consumerNo, String consumerName, int previousMonthReading, int currentMonthReading) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
    }

    public double computeBillAmount() {
        int unitsConsumed = currentMonthReading - previousMonthReading;
        double billAmount = 0;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1;
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 1 + (unitsConsumed - 100) * 2.5;
        } else if (unitsConsumed <= 500) {
            billAmount = 100 * 1 + 100 * 2.5 + (unitsConsumed - 200) * 4;
        } else {
            billAmount = 100 * 1 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
        }
        return billAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter consumer no.: ");
        int consumerNo = scanner.nextInt();
        System.out.print("Enter consumer name: ");
        String consumerName = scanner.next();
        System.out.print("Enter previous month reading: ");
        int previousMonthReading = scanner.nextInt();
        System.out.print("Enter current month reading: ");
        int currentMonthReading = scanner.nextInt();
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousMonthReading, currentMonthReading);
        double billAmount = bill.computeBillAmount();
        System.out.println("Example 1:");
        System.out.println("Input: consumer no.: " + consumerNo);
        System.out.println("Consumer name: " + consumerName);
        System.out.println("Previous month reading: " + previousMonthReading);
        System.out.println("Current month reading: " + currentMonthReading);
        System.out.println("Output: Bill Amount = " + billAmount);
    }
}