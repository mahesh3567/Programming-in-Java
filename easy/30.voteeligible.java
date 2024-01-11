import java.util.Scanner;

public class voteeligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String userInput = scanner.nextLine();

        try {
            int age = Integer.parseInt(userInput);

            if (age < 0) {
                System.out.println("Invalid age. Please enter a non-negative integer.");
            } else if (age >= 18) {
                System.out.println("You are eligible to vote!");
            } else {
                int yearsLeft = 18 - age;
                System.out.println("You are allowed to vote after " + yearsLeft + " years.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
