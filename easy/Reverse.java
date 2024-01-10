import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); 
        }
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
