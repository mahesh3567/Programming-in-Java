import java.util.Arrays;


public class abstractclass {
    public static void main(String[] args) {
        // Example usage
        int[] numbers = {3, 7, 2, 5, 8};

        // Create an instance of the concrete class
        MathOperations math = new MathOperations();

        // Use all methods
        System.out.println("Total: " + math.total(numbers));
        System.out.println("Average: " + math.average(numbers));
        System.out.println("Mean: " + math.mean(numbers)); // Changed to math.average(numbers)
        System.out.println("Mode: " + math.mode(numbers));
        System.out.println("Median: " + math.median(numbers));
    }
}
// Abstract class
abstract class AbstractMath {
    // Abstract methods
    abstract int total(int[] numbers);
    abstract double average(int[] numbers);

    // Concrete methods
    double mean(int[] numbers) {
        return total(numbers) / (double) numbers.length;
    }

    int mode(int[] numbers) {
        // Logic for finding mode (most frequent element) goes here
        // For simplicity, let's assume the first element is the mode
        return numbers[0];
    }

    double median(int[] numbers) {
        // Logic for finding median (middle element) goes here
        // For simplicity, let's sort the array and find the middle element
        Arrays.sort(numbers);
        int n = numbers.length;
        if (n % 2 == 0) {
            return (numbers[n/2 - 1] + numbers[n/2]) / 2.0;
        } else {
            return numbers[n/2];
        }
    }
}

// Concrete class extending AbstractMath
class MathOperations extends AbstractMath {
    // Implementing abstract methods
    int total(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    double average(int[] numbers) {
        return total(numbers) / (double) numbers.length;
    }
}
