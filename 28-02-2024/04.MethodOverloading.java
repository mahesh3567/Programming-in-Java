public class MethodOverloading {
    // Original method with two parameters
    int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with one parameter
    int sum(int a) {
        return a;
    }

    // Overloaded method with double parameters
    double sum(double a, double b) {
        return a + b;
    }

    // Overloaded method with different types of parameters
    double sum1(double a, double b) {
        return (int)(a + b);
    }

    public static void main(String[] args) {
        MethodOverloading main = new MethodOverloading();

        // Original method with two parameters
        System.out.println("Sum of 2 and 3: " + main.sum(2, 3));

        // Overloaded method with three parameters
        System.out.println("Sum of 2, 3 and 4: " + main.sum(2, 3, 4));

        // Overloaded method with one parameter
        System.out.println("Sum of 2: " + main.sum(2));

        // Overloaded method with double parameters
        System.out.println("Sum of 2.5 and 3.5: " + main.sum(2.5, 3.5));

        // Original method
        int sum1 = main.sum(1, 2);
        System.out.println("Sum of two integers: " + sum1);

        // Overloaded method with different types of parameters
        double sum2 = main.sum(1.5, 2.5);
        System.out.println("Sum of two doubles: " + sum2);
    }
}
