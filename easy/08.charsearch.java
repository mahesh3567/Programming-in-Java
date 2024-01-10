import java.util.Scanner;

public class charsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);

        int index = -1;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(searchChar + " is found in string at index: " + index);
        } else {
            System.out.println(searchChar + " is not found in the string.");
        }
    }
}
