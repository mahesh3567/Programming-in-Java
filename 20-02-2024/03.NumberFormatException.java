import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        // Scenario a: Parsing a Non-Numeric String.
        try {
            String nonNumericString = "abc";
            int parsedValue = Integer.parseInt(nonNumericString);
            System.out.println("Parsed value: " + parsedValue);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Parsing a Non-Numeric String");
        }

        // Scenario b: Reading User Input Without Validation.
        try {
            String userInput = "123abc";
            int parsedInput = Integer.parseInt(userInput);
            System.out.println("Parsed input: " + parsedInput);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Reading User Input Without Validation");
        }

        // Scenario c: Formatting Issues in "Decimal Format".
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
            String formattedNumber = decimalFormat.format(1234.5678);
            System.out.println("Formatted number: " + formattedNumber);
            double parsedNumber = (Double) decimalFormat.parse(formattedNumber);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (ParseException e) {
            System.out.println("ParseException: Formatting Issues in Decimal Format");
        }

        // Scenario d: Incorrectly using localized decimal separators.
        try {
            DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(Locale.getDefault());
            String localizedNumber = "1,234.567";
            double parsedLocalizedNumber = decimalFormat.parse(localizedNumber).doubleValue();
            System.out.println("Parsed localized number: " + parsedLocalizedNumber);
        } catch (ParseException e) {
            System.out.println("ParseException: Incorrectly using localized decimal separators");
        }
    }
}