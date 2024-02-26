import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        int length = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + length);
    }

    public static int lengthOfLastWord(String s) {
        // Remove trailing and leading spaces
        s = s.trim();

        int length = 0;
        int index = s.length() - 1;

        // Iterate from the end of the string
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }

        return length;
    }
}
