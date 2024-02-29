
public class interfaccedemo1 {
    public static void main(String[] args) {
        // Example usage
        int[] numbers = {80, 75, 90, 85, 95};

        // Create an instance of the class implementing the interfaces
        Calculation calculation = new Calculation();

        // Use the methods from the implemented interfaces
        int sum = calculation.sum(numbers);
        double avg = calculation.avg(numbers);
        double percentage = calculation.percentage(350, 500); // Obtained marks: 350, Total marks: 500

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Percentage: " + percentage + "%");
    }
}
// Interface for sum
interface Summable {
    int sum(int[] numbers);
}

// Interface for average
interface Averagable {
    double avg(int[] numbers);
}

// Interface for percentage
interface PercentageCalculable {
    double percentage(double obtained, double total);
}

// Class implementing all three interfaces
class Calculation implements Summable, Averagable, PercentageCalculable {
    @Override
    public int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    @Override
    public double avg(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }

    @Override
    public double percentage(double obtained, double total) {
        return (obtained / total) * 100.0;
    }
}
