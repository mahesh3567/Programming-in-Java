import java.util.Scanner;

public class splchar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String inputLine = scanner.nextLine();
        scanner.close();

        StringBuilder specialCharacters = new StringBuilder();
        int specialCharacterCount = 0;

        for (int i = 0; i < inputLine.length(); i++) {
            char currentChar = inputLine.charAt(i);
            if (Character.isLetterOrDigit(currentChar) || Character.isWhitespace(currentChar)) {
            } else {
                specialCharacters.append(currentChar);
                specialCharacterCount++;
            }
        }

        System.out.println("Spl Char: " + specialCharacters.toString());
        System.out.println("No.of Spl Char: " + specialCharacterCount);
    }
}
