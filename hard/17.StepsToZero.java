import java.util.Scanner;

public class StepsToZero {

    public static int stepsToZero(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer num: ");
        int num = scanner.nextInt();
        int steps = stepsToZero(num);
        System.out.println("Example 1:");
        System.out.println("Input: num = " + num);
        System.out.println("Output: " + steps);
    }
}