public class IllegalArgumentExceptionExample {

    public static void main(String[] args) {
        // Scenario a: Negative Argument in the method requiring non-negative values
        try {
            System.out.println(nonNegativeValue(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Negative Argument in the method requiring non-negative values");
        }

        // Scenario b: Invalid Enum Constant Passed to a Method
        try {
            System.out.println(invalidEnumConstant("INVALID"));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Invalid Enum Constant Passed to a Method");
        }

        // Scenario c: Setting an Invalid Range for a Method Parameter
        try {
            System.out.println(invalidRange(11));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Setting an Invalid Range for a Method Parameter");
        }

        // Scenario d: Empty or Null String Argument in a Method Requiring Non-Empty String
        try {
            System.out.println(nonEmptyString(""));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Empty or Null String Argument in a Method Requiring Non-Empty String");
        }
    }

    public static int nonNegativeValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        return value;
    }

    public static String invalidEnumConstant(String value) {
        if (!value.equals("A") && !value.equals("B")) {
            throw new IllegalArgumentException("Invalid Enum Constant");
        }
        return value;
    }

    public static int invalidRange(int value) {
        if (value < 5 || value > 10) {
            throw new IllegalArgumentException("Value must be between 5 and 10");
        }
        return value;
    }

    public static String nonEmptyString(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty or null");
        }
        return value;
    }
}