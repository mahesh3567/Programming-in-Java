import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFilter {

    private List<String> words;

    public WordFilter(String[] words) {
        this.words = new ArrayList<>();
        for (String word : words) {
            this.words.add(word);
        }
    }

    public int f(String pref, String suff) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.startsWith(pref) && word.endsWith(suff)) {
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            return -1;
        }
        return result.get(result.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }
        System.out.print("Enter prefix: ");
        String pref = scanner.nextLine();
        System.out.print("Enter suffix: ");
        String suff = scanner.nextLine();
        WordFilter wordFilter = new WordFilter(words);
        int result = wordFilter.f(pref, suff);
        System.out.println("Example 1:");
        System.out.println("Input: words = [" + String.join(", ", words) + "]");
        System.out.print("Prefix: " + pref);
        System.out.println(" Suffix: " + suff);
        if (result == -1) {
            System.out.println("Output: -1");
        } else {
            System.out.println("Output: " + result);
        }
    }
}