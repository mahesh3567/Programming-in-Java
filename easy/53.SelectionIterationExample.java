	import java.util.Scanner;

public class SelectionIterationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. if-else statement");
            System.out.println("2. switch statement");
            System.out.println("3. while loop");
            System.out.println("4. do-while loop");
            System.out.println("5. for loop");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Syntax of if-else statement: if (condition) { /* code block */ } else { /* code block */ }");
                    break;
                case 2:
                    System.out.println("Syntax of switch statement: switch (expression) { case value1: /* code block */ break; case value2: /* code block */ break; default: /* code block */ }");
                    break;
                case 3:
                    System.out.println("Syntax of while loop: while (condition) { /* code block */ }");
                    break;
                case 4:
                    System.out.println("Syntax of do-while loop: do { /* code block */ } while (condition);");
                    break;
                case 5:
                    System.out.println("Syntax of for loop: for (initialization; condition; update) { /* code block */ }");
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
