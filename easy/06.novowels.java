import java.util.Scanner;

public class novowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String inputStatement = scanner.nextLine().toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < inputStatement.length(); i++) {
            char ch = inputStatement.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
