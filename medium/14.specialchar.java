import java.util.Scanner;

public class specialchar {
    private static final String[] specialChars = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")",
            "[", "]", "|", ";", "'", ",", ".", "/", "{", "}", "\\", ":", "\"", "<", ">", "?"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String input = scanner.nextLine();
        int specialCharCount = countSpecialCharacters(input);
        System.out.println("Number of special characters: " + specialCharCount);
    }

    private static int countSpecialCharacters(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            for (String specialChar : specialChars) {
                if (c == specialChar.charAt(0)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}