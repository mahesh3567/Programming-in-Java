import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String depositorName, int accountNumber, String accountType, double balance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account details:");
        System.out.print("Depositor Name: ");
        String name = scanner.nextLine();
        System.out.print("Account Number: ");
        int accNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Account Type (Savings/Current): ");
        String type = scanner.nextLine();

        BankAccount account = new BankAccount(name, accNumber, type, 10000);

        account.displayBalance();

        System.out.print("Enter amount to deposit: Rs. ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: Rs. ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();

        scanner.close();
    }
}
