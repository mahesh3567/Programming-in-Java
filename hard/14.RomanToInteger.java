import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String s = scanner.nextLine();
        scanner.close();

        int result = romanToInt(s);
        System.out.println("Integer representation: " + result);
    }

    public static int romanToInt(String s) {
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = values[s.charAt(i) - 'A'];
            if (i < s.length() - 1 && value < values[s.charAt(i + 1) - 'A']) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }
}
