import java.util.Scanner;

public class reversealphabatical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        char[] charArray = inputWord.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (charArray[j] < charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        System.out.print("Word in reverse alphabetical order: ");
        for (char ch : charArray) {
            System.out.print(ch);
        }
    }
}
