import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class listiterator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements separated by space: ");
        String input = scanner.nextLine();
        List<Character> list = new ArrayList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        ListIterator<Character> iterator = list.listIterator(list.size());

        // Append "+" symbol to each element using ListIterator
        while (iterator.hasPrevious()) {
            Character c = iterator.previous();
            iterator.set(c == '+' ? c : (char) (c + '+'));
        }

        // Print elements in reverse order
        for (Character c : list) {
            System.out.print(c);
        }
        scanner.close();
    }

}