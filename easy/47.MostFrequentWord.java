import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class MostFrequentWord {
    public static void main(String[] args) {
        String paragraph = "Ram hit a ball, the hit ball flew far after it was hit";
        String[] banned = {"hit"};

        String[] words = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        Map<String, Integer> wordFrequency = new HashMap<>();
        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                int frequency = wordFrequency.getOrDefault(word, 0) + 1;
                wordFrequency.put(word, frequency);

                if (frequency > maxFrequency) {
                    mostFrequentWord = word;
                    maxFrequency = frequency;
                }
            }
        }

        System.out.println("Output: " + mostFrequentWord);
    }
}
