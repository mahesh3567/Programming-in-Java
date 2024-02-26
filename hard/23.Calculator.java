import java.util.Scanner;

public class Calculator implements Runnable {
    private String operation;
    private double operand1;
    private double operand2;

    public Calculator(String operation, double operand1, double operand2) {
        this.operation = operation;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void run() {
        double result = 0;
        switch (operation) {
            case "add":
                result = operand1 + operand2;
                break;
            case "subtract":
                result = operand1 - operand2;
                break;
            case "multiply":
                result = operand1 * operand2;
                break;
            case "divide":
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Error: Invalid operation");
                return;
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();
        System.out.print("Enter operand1: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Enter operand2: ");
        double operand2 = scanner.nextDouble();
        Calculator calculator = new Calculator(operation, operand1, operand2);
        Thread thread1 = new Thread(calculator);
        Thread thread2 = new Thread(calculator);
        thread1.start();
        thread2.start();
    }
}