import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereadwrite{
    public static void main(String[] args) {
        String filename = "example.txt";

        // Writing to a file using FileWriter
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, World!\n");
            writer.write("This is a sample text written to a file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file using FileReader
        try (FileReader reader = new FileReader(filename)) {
            int character;
            StringBuilder content = new StringBuilder();
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("File content:\n" + content.toString());
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
