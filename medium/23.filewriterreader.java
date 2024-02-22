import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class filewriterreader {

    public static void main(String[] args) {
        String text = "Computer Science and Engineering";

        try (FileWriter fileWriter = new FileWriter("example.txt")) {
            fileWriter.write(text);
            System.out.println("Text written to file: " + text);

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        try (FileReader fileReader = new FileReader("example.txt")) {
            int character;
            StringBuilder stringBuilder = new StringBuilder();

            while ((character = fileReader.read()) != -1) {
                stringBuilder.append((char) character);
            }

            String readText = stringBuilder.toString();
            System.out.println("Text read from file: " + readText);

        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}