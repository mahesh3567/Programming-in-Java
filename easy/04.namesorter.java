import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class namesorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of names: ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println("Enter name #" + (i + 1) + ": ");
            names.add(scanner.nextLine());
        }

        System.out.println("A/D ");
        char sortingChoice = scanner.next().charAt(0);
        scanner.close();

        if (Character.toUpperCase(sortingChoice) == 'A') {
            Collections.sort(names);
        } else if (Character.toUpperCase(sortingChoice) == 'D') {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("invalid choose a/d");
            return;
        }

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
