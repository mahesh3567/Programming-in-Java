import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class wordcounter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java WordCounter <file_path>");
            System.exit(1);
        }

        String filePath = args[0];
        try {
            Counts counts = countElements(filePath);
            System.out.println("Number of lines: " + counts.lineCount);
            System.out.println("Number of words: " + counts.wordCount);
            System.out.println("Number of characters: " + counts.charCount);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static Counts countElements(String filePath) throws IOException {
        long lineCount = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8).count();

        long charCount = Files.lines(Paths.get(filePath))
                .mapToInt(String::length)
                .sum();

        long wordCount = Files.lines(Paths.get(filePath))
                .flatMapToInt(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .count();

        return new Counts(lineCount, wordCount, charCount);
    }

    static class Counts {
        final long lineCount;
        final long wordCount;
        final long charCount;

        Counts(long lineCount, long wordCount, long charCount) {
            this.lineCount = lineCount;
            this.wordCount = wordCount;
            this.charCount = charCount;
        }
    }
}