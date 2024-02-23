import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readfile {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Replace "example.txt" with your file name
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
