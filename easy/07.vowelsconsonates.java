import java.util.Scanner;

public class vowelsconsonates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine().toLowerCase(); 

        String consonants = "";
        String vowels = "";

        for (int i = 0; i < word.length(); i++) {
            char Char= word.charAt(i);

            if (Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u') {
                vowels += Char;
            } else if (Character.isLetter(Char)) {
                consonants += Char;
            }
        }
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
        scanner.close();
    }
}