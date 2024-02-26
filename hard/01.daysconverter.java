import java.util.Scanner;

public class daysconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Convert days to years, weeks, and days
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        int remainingDaysInWeeks = remainingDays % 7;
        
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + remainingDaysInWeeks);
        
        // Get the corresponding day of the week for a given date
        System.out.print("\nEnter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        if (month < 3) {
            month += 12;
            year--;
        }
        
        int k = year % 100;
        int j = year / 100;
        
        int dayOfWeek = (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        System.out.println("Output: " + daysOfWeek[dayOfWeek]);
    }
}
