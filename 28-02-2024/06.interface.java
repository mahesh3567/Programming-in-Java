public class InterfaceDemo {
    public static void main(String[] args) {
        // Create an instance of the implementing class
        BasicCalculator calculator = new BasicCalculator();

        // Use the methods
        int sum = calculator.add(5, 3);
        int difference = calculator.sub(10, 4);
        int product = calculator.mul(6, 2);
        double quotient = calculator.div(15, 3);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

// Interface
interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    double div(int a, int b);
}

// Implementing class
class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public double div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
