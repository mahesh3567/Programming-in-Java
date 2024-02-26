public class ArithmeticException1 {
    public static void main(String[] args) {
        // a) Divided by Zero
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Divided by Zero ArithmeticException: " + e.getMessage());
        }

        // b) Logarithm of negative or Zero
        try {
            double number = -5;
            if (number <= 0) {
                throw new ArithmeticException("Logarithm of a non-positive number is undefined");
            }
            double logResult = Math.log(number);
            System.out.println("Logarithm Result: " + logResult);
        } catch (ArithmeticException e) {
            System.out.println("Logarithm ArithmeticException: " + e.getMessage());
        }

        // c) Tan 90 Degree
        try {
            double angle = 90;
            if (angle % 90 == 0 && angle % 180 != 0) {
                throw new ArithmeticException("Tan of 90 or 270 degrees is undefined");
            }
            double tanResult = Math.tan(Math.toRadians(angle));
            System.out.println("Tan Result: " + tanResult);
        } catch (ArithmeticException e) {
            System.out.println("Tan ArithmeticException: " + e.getMessage());
        }

        // d) Zero power Zero
        try {
            double base = 0;
            double exponent = 0;
            if (base == 0 && exponent == 0) {
                throw new ArithmeticException("Zero raised to the power of Zero is undefined");
            }
            double powerResult = Math.pow(base, exponent);
            System.out.println("Power Result: " + powerResult);
        } catch (ArithmeticException e) {
            System.out.println("Power ArithmeticException: " + e.getMessage());
        }
    }
}
