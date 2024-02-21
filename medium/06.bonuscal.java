import java.util.Scanner;

public class bonuscal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        double bonus = 0;
        if (salary < 10000) {
            bonus = salary ;
        } else {
            switch (grade) {
                case 'A':
                    bonus = salary * 0.05;
                    break;
                case 'B':
                    bonus = salary * 0.1;
                    break;
                default:
                    System.out.println("Invalid grade");
                    return;
            }
        }

        double totalSalary = salary + bonus;

        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid: " + totalSalary);

        scanner.close();
    }
}