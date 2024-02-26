import java.util.Scanner;


public class employeedetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Employee object
        Employee employee = new Employee();

        // Input employee details from user
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Set employee details using setter methods
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setEmployeeSalary(salary);

        // Display employee details using getter methods
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getEmployeeSalary());

        scanner.close();
    }
}
class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    // Setter methods
    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void setEmployeeSalary(double salary) {
        this.employeeSalary = salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public double getEmployeeSalary() {
        return this.employeeSalary;
    }
}
