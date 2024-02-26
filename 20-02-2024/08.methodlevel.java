import java.io.IOException;

// Class level throws
public class Example {
    // Method level throws
    public void methodWithThrows() throws IOException {
        // Some code that might throw IOException
        throw new IOException("IOException occurred");
    }
}

// Another class with method level throws
class AnotherExample {
    // Method level throws
    public void anotherMethodWithThrows() throws NullPointerException {
        // Some code that might throw NullPointerException
        throw new NullPointerException("NullPointerException occurred");
    }
}

// Main class to demonstrate exception handling
public class methodlevel {
    public static void main(String[] args) {
        Example example = new Example();
        AnotherExample anotherExample = new AnotherExample();

        try {
            // Calling methodWithThrows which throws IOException
            example.methodWithThrows();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        try {
            // Calling anotherMethodWithThrows which throws NullPointerException
            anotherExample.anotherMethodWithThrows();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
